import java.util.*;

/**
 * Created by Administrator on 2016/4/15.
 */
//public class Solution {
//    public List<int[]> getSkyline(int[][] buildings) {
//        int[][] B = buildings;
//        List<int[]> res = new ArrayList<int[]>();
//        if (B == null || B.length == 0)
//            return res;
//
//        int[] X = new int[B.length*2];
//        int n = 0;
//        for (int i=0; i<B.length; i++){
//            X[n++] = B[i][0];
//            X[n++] = B[i][1];
//        }
//        Arrays.sort(X);
//        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//        n = 0;
//        int[] p = { X[0], 0 };
//        res.add( p );
//        map.put(X[0], 0);
//        for (int i=1; i<X.length; i++){
//            if ( X[i] != p[0] ){
//                p = new int[2];
//                p[0] = X[i];
//                n++;
//                res.add(p);
//                map.put(X[i], n);
//            }
//        }
//
//        for (int i=0; i<B.length; i++){
//            int s = map.get(B[i][0]);
//            int e = map.get(B[i][1]);
//            int h = B[i][2];
//            for ( int j=s; j<e; j++ ){
//                p = res.get(j);
//                if (h>p[1])
//                    p[1] = h;
//            }
//        }
//        int ph = res.get(0)[1];
//        int i = 1;
//        while ( i<res.size()  ){
//            if ( ph == res.get(i)[1]){
//                res.remove(i);
//            } else {
//                ph = res.get(i)[1];
//                i++;
//            }
//        }
//        return res;
//    }
//}
public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<int[]>();
        List<int[]> height = new ArrayList<int[]>();
        // 拆解矩形，构建顶点的列表
        for(int[] b:buildings) {
            // 左顶点存为负数
            height.add(new int[]{b[0], -b[2]});
            // 右顶点存为正数
            height.add(new int[]{b[1], b[2]});
        }
        // 根据横坐标对列表排序，相同横坐标的点纵坐标小的排在前面
        Collections.sort(height, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] != b[0]){
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1];
                }
            }
        });
        // 构建堆，按照纵坐标来判断大小
        Queue<Integer> pq = new PriorityQueue<Integer>(11, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i2 - i1;
            }
        });
        // 将地平线值0先加入堆中
        pq.offer(0);
        // prev用于记录上次keypoint的高度
        int prev = 0;
        for(int[] h:height) {
            // 将左顶点加入堆中
            if(h[1] < 0) {
                pq.offer(-h[1]);
            } else {
                // 将右顶点对应的左顶点移去
                pq.remove(h[1]);
            }
            int cur = pq.peek();
            // 如果堆的新顶部和上个keypoint高度不一样，则加入一个新的keypoint
            if(prev != cur) {
                result.add(new int[]{h[0], cur});
                prev = cur;
            }
        }
        return result;
    }
}