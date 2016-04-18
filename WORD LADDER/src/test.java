import java.util.HashSet;

/**
 * Created by tangni on 3/21/16.
 */
public class test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String beginWord="hit";
        String endWord="cog";
        HashSet<String> dict=new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        int result=solution.ladderLength(beginWord,endWord,dict);
        System.out.print(result);
    }
}
