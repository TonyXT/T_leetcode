/**
 * Created by Administrator on 2016/2/8.
 */
public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int p1=words.length-1;
        int p2=words.length-1;
        int distance=0;
        int sdistance=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                p1=i;
                distance=Math.abs(p1-p2);
                sdistance=Math.min(distance,sdistance);
            }
            if(words[i].equals(word2)){
                p2=i;
                distance=Math.abs(p1-p2);
                sdistance=Math.min(distance,sdistance);
            }
        }
        return sdistance;
    }
}