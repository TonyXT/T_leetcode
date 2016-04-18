/**
 * Created by Administrator on 2015/1/9.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            int bound=0;
            if(nums.length-i<k){
                bound=nums.length;
            }
            else{
                bound=i+k;
            }
            for(int j=i+1;j<bound;j++){
                int a=nums[i];
                int b=nums[j];
                if(a==b){
                    return true;
                }

            }


        }
        return false;

    }
}