/**
 * Created by Tony on 2016/4/25.
 */
public class test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String[] word={"oath","pea","eat","rain"};
        char [][] board={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        solution.findWords(board,word);
    }
}
