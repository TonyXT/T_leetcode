import java.util.Set;

/**
 * Created by tangni on 3/11/16.
 */
public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s.length()==0 || s==null) return true;
        boolean[] f=new boolean[s.length()+1];
        f[0]=true;
        int mlen=getmaxlength(wordDict);
        for(int i=1;i<=s.length();i++){
            f[i]=false;
            for(int j=1;j<=mlen&&j<=i;j++){
                if(!f[i-j]){
                    continue;
                }
                String word=s.substring(i-j,i);
                if(wordDict.contains(word)){
                    f[i]=true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
    private int getmaxlength(Set<String> wordDict){
        int maxLength=0;
        for(String Dict:wordDict){
            maxLength=Math.max(maxLength,Dict.length());
        }
        return maxLength;
    }

}