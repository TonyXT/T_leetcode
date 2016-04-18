/**
 * Created by Administrator on 2016/1/10.
 */

    public class Solution {
        public void moveZeroes(int[] nums) {
            int counter=0;
            for (int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    counter++;
                    continue;
                }
                else{
                    nums[i-counter]=nums[i];
                    continue;
                }
            }
            for (int i=nums.length-counter;i<nums.length;i++){
                nums[i]=0;
            }
        }
    }

