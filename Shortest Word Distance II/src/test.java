/**
 * Created by Administrator on 2016/2/14.
 */
public class test {
    public static void main(String[] args) {
        String[] words={"practice", "makes", "perfect", "coding", "makes"};
        WordDistance wordDistance = new WordDistance(words);
        int result=wordDistance.shortest("coding", "practice");
        System.out.print(result);
    }
}
