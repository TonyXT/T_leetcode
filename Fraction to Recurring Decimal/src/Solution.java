import java.util.HashMap;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return "0";
        long num=Math.abs((long) numerator);
        long deno=Math.abs((long) denominator);
        StringBuilder result=new StringBuilder();
        if(num<0||deno<0) result.append("-");

        result.append(num/deno);
        if(num%deno==0) return result.toString();
        result.append(".");
        num=num%deno;
        HashMap<Long,Integer> hm=new HashMap<Long,Integer>();
        hm.put(num,result.length());
        while(num!=0){
            num*=10;
            result.append(num/deno);
            num=num%deno;
            if(hm.containsKey(num)){
                int index=hm.get(num);
                result.insert(index,"(");
                result.append(")");
                return result.toString();
            }
            else hm.put(num,result.length());
        }
        return result.toString();
    }
}