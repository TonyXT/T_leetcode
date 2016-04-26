/**
 * Created by Tony on 2016/4/23.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0) return true;
        String input=s.toLowerCase();
        int last=input.length()-1;
        int first=0;
        while(first<last){
            char f=input.charAt(first);
            char l=input.charAt(last);
            if(!Character.isDigit(input.charAt(first))) {
                if (f < 'a' || f > 'z') {
                    first = first + 1;
                    continue;
                }
            }
            if(!Character.isDigit(input.charAt(last))) {
                if (l < 'a' || l > 'z') {
                    last = last - 1;
                    continue;
                }
            }
            if(l==f){
                first++;
                last--;
            }
            else return false;
        }
        return true;
    }
}