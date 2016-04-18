import java.util.Arrays;

/**
 * Created by tangni on 2/12/16.
 */
public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int sum=0;
            int a=nums[i];
            sum=a;
            for(int j=i+1;j<nums.length-1;j++){
                int sum2;
                int b=nums[j];
                sum2=sum+b;
                if(sum2>=target) break;
                for(int k=j+1;k<nums.length;k++){
                    int sum3;
                    int c=nums[k];
                    sum3=sum2+c;
                    if(sum3>target) break;
                    if(sum3<target) count++;
                }
            }
        }
        return count;
    }
}