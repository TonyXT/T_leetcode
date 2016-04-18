/**
 * Created by tangni on 2/27/16.
 */
public class Solution {

    public int rob(int[] num) {

        int len=num.length;
        if(len==0) return 0;
        int[] result=new int[len];
        result[0]=num[0];
        int max=num[0];
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(i-j>=2){
                    result[i]=Math.max(result[i],result[j]+num[i]);
                }else{
                    result[i]=Math.max(result[j],num[i]);
                }
            }
            if(result[i]>max) max=result[i];
        }
        return max;
        // int last = 0;
        // int now = 0;
        // int tmp;
        // for (int n :num) {
        //     tmp = now;
        //     now = Math.max(last + n, now);
        //     last = tmp;
        // }
        // return now;
    }
}