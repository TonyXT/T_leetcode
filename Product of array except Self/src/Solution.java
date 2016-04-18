/**
 * Created by tangni on 2/5/16.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int [] output = new int[len];

        int leftMult = 1, rightMult = 1;

        for(int i = len-1; i >= 0; i--){
            output[i] = rightMult;
            rightMult *= nums[i];
        }
        for(int j = 0; j < len; j++){
            output[j] *= leftMult;
            leftMult *= nums[j];

        }

        return output;

    }
}
