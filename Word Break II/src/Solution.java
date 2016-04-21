import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Tony on 2016/4/20.
 */
public class Solution {
//    public List<String> wordBreak(String s, Set<String> wordDict) {
//        List<Integer>[] starts = new List[s.length() + 1]; // valid start positions
//        starts[0] = new ArrayList<Integer>();
//
//        int maxLen = getMaxLen(wordDict);
//        for (int i = 1; i <= s.length(); i++) {
//            for (int j = i - 1; j >= i - maxLen && j >= 0; j--) {
//                if (starts[j] == null) continue;
//                String word = s.substring(j, i);
//                if (wordDict.contains(word)) {
//                    if (starts[i] == null) {
//                        starts[i] = new ArrayList<Integer>();
//                    }
//                    starts[i].add(j);
//                }
//            }
//        }
//
//        List<String> rst = new ArrayList<String>();
//        if (starts[s.length()] == null) {
//            return rst;
//        }
//
//        dfs(rst, "", s, starts, s.length());
//        return rst;
//    }
//
//
//    private void dfs(List<String> rst, String path, String s, List<Integer>[] starts, int end) {
//        if (end == 0) {
//            rst.add(path.substring(1));
//        }
//        for (Integer start: starts[end]) {
//            String word = s.substring(start, end);
//            dfs(rst, " " + word + path, s, starts, start);
//        }
//    }
//
//    private int getMaxLen(Set<String> wordDict) {
//        int max = 0;
//        for (String s : wordDict) {
//            max = Math.max(max, s.length());
//        }
//        return max;
//    }
public List<String> wordBreak(String s, Set<String> wordDict) {
    List<Integer>[] dp=new List[s.length()+1];
    //get the max length of word in the wordDict
    int maxwordlen=maxwordlength(wordDict);
    //DP to get the word break
    dp[0]=new ArrayList<Integer>();
    for(int i=1;i<=s.length();i++){
        for(int j=i-1;j>=i-maxwordlen&&j>=0;j--){
            if(dp[j]==null) continue;
            String word=s.substring(j,i);
            if(wordDict.contains(word)){
                if(dp[i]==null) dp[i]=new ArrayList<Integer>();
                dp[i].add(j);
            }
        }
    }
    List<String> result=new ArrayList<String>();
    if(dp[s.length()]==null) return result;
    DFS(dp,result,s.length(),"",s);
    return result;
}

    private void DFS(List<Integer>[] dp,List<String> result,int end,String path,String s){
        if(end==0) result.add(path.substring(1));
        for(Integer index:dp[end]){
            String word=s.substring(index,end);
            DFS(dp,result,index," "+word+path,s);
        }
    }

    private int maxwordlength(Set<String> wordDict){
        int length=0;
        for(String word:wordDict){
            length=Math.max(word.length(),length);
        }
        return length;
    }
}