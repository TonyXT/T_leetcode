/**
 * Created by tangni on 2/26/16.
 */
public class test {
    public static void main(String[] args) {
        String pattern="ab";
        String str="happy hacking";
        Solution solution=new Solution();
        boolean result=solution.wordPattern(pattern,str);
        System.out.print(result);
    }
}
