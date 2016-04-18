import java.util.HashSet;
import java.util.Set;

/**
 * Created by tangni on 3/11/16.
 */
public class test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        Set<String> dict=new HashSet<>();
        dict.add("a");
        dict.add("leet");
        dict.add("code");
        String s="aleetcode";
        System.out.print(solution.wordBreak(s,dict));

    }
}
