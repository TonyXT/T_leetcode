/**
 * Created by Tony on 2016/4/19.
 */
public class test {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("abc");
        trie.insert("ab");
        System.out.print(trie.search("ab"));
    }
}
