import java.util.*;

/**
 * Created by Administrator on 2016/4/2.
 */
//public class Solution {
//    public boolean validTree(int n, int[][] edges) {
//        int[] visited = new int[n];
//        List<List<Integer>> adjList = new ArrayList<List<Integer>>();
//        for (int i=0; i<n; ++i) { adjList.add(new ArrayList<Integer>()); }
//        for (int[] edge: edges) {
//            adjList.get(edge[0]).add(edge[1]);
//            adjList.get(edge[1]).add(edge[0]);
//        }
//        Deque<Integer> q = new ArrayDeque<Integer>();
//        q.addLast(0); visited[0] = 1;  // vertex 0 is in the queue, being visited
//        while (!q.isEmpty()) {
//            Integer cur = q.removeFirst();
//            for (Integer succ: adjList.get(cur)) {
//                if (visited[succ] == 1) { return false; }  // loop detected
//                if (visited[succ] == 0) { q.addLast(succ); visited[succ] = 1; }
//            }
//            visited[cur] = 2;  // visit completed
//        }
//        for (int v: visited) { if (v == 0) { return false; } }  // # of connected components is not 1
//        return true;
//    }
public class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (n <= 1) return true;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            int x = find(parent, edge[0]);
            int y = find(parent, edge[1]);
            if (x == y) return false;
            parent[y] = x;
        }

        return edges.length == n - 1;
    }

    public int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }
}
//public class Solution {
//    public boolean validTree(int n, int[][] edges) {
//        if(n<1) return true;
//        int[] nodes=new int[n];
//        for(int i=0;i<=edges.length;i++){
//            nodes[i]=i;
//        }
//        for(int i=0;i<edges.length;i++){
//            int x=find(edges[i][0],nodes);
//            int y=find(edges[i][1],nodes);
//            if(x==y) return false;
//            nodes[y]=x;
//        }
//        return true;
//    }
//    private int find(int i,int[] nodes){
//        if(nodes[i]!=i){
//            find(nodes[i],nodes);
//        }
//        return nodes[i];
//    }
//}