import java.util.HashSet;

/**
 * Created by Tony on 2016/4/20.
 */
public class test {
    public static void main(String[] args) {
        String s="catsanddog";
        HashSet<String> set=new HashSet<String>();
        set.add("cat");
        set.add("cats");
        set.add("and");
        set.add("sand");
        set.add("dog");
        Solution solution=new Solution();
        solution.wordBreak(s,set);
    }
}
