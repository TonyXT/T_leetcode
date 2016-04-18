/**
 * Created by tangni on 2/10/16.
 */
public class Solution {
    public boolean isStrobogrammatic(String num) {
        int len=num.length();
        int i=0;
        for(i=0;i<len/2;i++){
            int j=len-1-i;
            char c=num.charAt(i);
            char c2=num.charAt(j);
            if(c=='0'){
                if(c2!='0') return false;
            }
            else if(c=='1'){
                if(c2!='1') return false;
            }
            else if(c=='6'){
                if(c2!='9') return false;
            }
            else if(c=='8'){
                if(c2!='8') return false;
            }
            else if(c=='9'){
                if(c2!='6') return false;
            }
            else return false;

        }
        if(len%2!=0) {
            if(len==1) return true;
            char odd=num.charAt(i+1);
            if(odd!='8'&&odd!='0'&&odd!='1') return false;
        }
        return true;
    }
}