/**
 * Created by tangni on 3/13/16.
 */
public class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int count=1;
            for(int j=1;j<=s.length();j++){
                if(j>=s.length()||s.charAt(j-1)!=s.charAt(j)){
                    sb.append(count);
                    sb.append(s.charAt(j-1));
                    count=0;
                }
                count++;
            }
            s=sb.toString();
        }
        return s;
    }
}