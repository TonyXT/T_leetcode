import java.util.ArrayList;

/**
 * Created by tangni on 2/1/16.
 */
public class Solution {
    public int reverse(int x) {
        Boolean flag=true;
        if(x<0) {
            x=-x;
            flag=false;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(x/10>0){
            int digit=x%10;
            al.add(digit);
            x=x/10;
        }
        al.add(x);
        int sum=0;
        for(int i=0;i<al.size();i++){
            Double n=Math.pow(10,al.size()-1-i);
            sum+=al.get(i)*n;
        }
        if(!flag) sum=-sum;
        return sum;
    }
}
