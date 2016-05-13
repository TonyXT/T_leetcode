import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Tony on 2016/5/6.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        while(str!=null){
            System.out.print(Palindrome(str));
            str=in.nextLine();
        }
    }
    static boolean Palindrome(String str){
        boolean result=false;
        HashMap<Character,Integer> map=new HashMap<>();
        int length=str.length();
        for(int i=0;i<length;i++){
            char c=str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else {
                int value=map.get(c);
                value=value+1;
                map.put(c,value);
            }
        }
        int odd=0;

        for(Integer value: map.values()){
            if(value%2!=0) odd++;
        }
        if(length==1) return true;
        else if(length%2==0){
           if(odd==0) result=true;
        }
        else {
           if(odd==1) result=true;
        }
        return result;
    }
}
