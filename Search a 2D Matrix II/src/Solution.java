/**
 * Created by Administrator on 2016/4/9.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==target) return true;
            if(matrix[i][0]<target){
                if(bsearch(matrix,target,i)) return true;
            }
            else break;
        }
        return false;
    }

    private boolean bsearch(int[][] matrix, int target,int i){
        int start=0;
        int end=matrix[i].length-1;
        while(end>start){
            int mid=start+(end-start)/2;
            if(matrix[i][mid]>target){
                end=mid-1;
            }
            else if(matrix[i][mid]<target){
                start=mid+1;
            }
            else return true;
        }
        if(matrix[i][start]==target) return true;
        return false;
    }
}