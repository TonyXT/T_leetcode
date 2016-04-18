import java.util.List;

/**
 * Created by tangni on 2/15/16.
 */
public class test {
    public static void main(String[] args) {
        int n=8;
        Solution solution=new Solution();

        List<List<Integer>> list=solution.getFactors(n);
        for(List<Integer> list1:list){
            for(int i:list1){
                System.out.print(i);
            }
        }
    }
}
