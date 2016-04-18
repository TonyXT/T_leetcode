/**
 * Created by tangni on 2/27/16.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        int num=Math.abs(x);
        while(num/10!=0){
            int len=String.valueOf(num).length();
            int a=(int)(num/Math.pow(10,len-1));
            int b=num%10;
            if(a!=b) return false;
            num=(int)(num-(a*Math.pow(10,len-1)))/10;
            int len2=String.valueOf(num).length();
            if(len2!=(len-2)) return false;
        }
        return true;
    }
}