/**
 * Created by Tony on 2016/4/29.
 */
public class Solution {
    public int findMinInsertionsDP(String str){
        char[] chars=str.toCharArray();
        if(chars.length==0) return 0;
        int n=chars.length;
        int[][]  table=new int[n][n];
        for(int gap=1;gap<n;gap++){
          for(int l=0,h=gap;h<n;h++,l++){
              if(chars[l]==chars[h])  table[l][h]=table[l+1][h-1];
              else{
                  table[l][h]=Math.min(table[l+1][h],table[l][h-1])+1;
              }
          }
        }
        return table[0][n-1];
    }
}
