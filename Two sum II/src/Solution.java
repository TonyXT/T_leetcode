/**
 * Created by tangni on 2/10/16.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            int a=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if((a+numbers[j])==target) {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}