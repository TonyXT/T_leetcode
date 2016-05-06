/**
 * Created by Tony on 2016/4/28.
 */
public class NumArray {
    int nums[];
    int[] BIT;
    int n;
    public NumArray(int[] nums){
        this.nums=nums;
        n=nums.length;
        BIT=new int[n+1];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            init(BIT,i,val);
        }
    }

    void init(int[] BIT,int i,int val){
        i++;
        while(i<=n){
          BIT[i]+=val;
          i+=(i)&(-i);
        }
    }
    void update(int i,int val){
        int delta=val-nums[i];
        while(i<n){
           BIT[i]+=delta;
           i+=(i)&(-i);
        }
    }
    public int getSum(int i){
        int sum=0;
        i++;
        while(i>0){
           sum+=BIT[i];
           i-=i&(-i);
        }
        return sum;
    }

    public int sumRange(int i,int j){
        return getSum(j)-getSum(i-1);
    }
}
