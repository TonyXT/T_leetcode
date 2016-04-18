/**
 * Created by Administrator on 2016/4/6.
 */
public class test {
    public static void main(String[] args) {
        String[] dictionary={"dog","dig"};
        ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
        System.out.print(vwa.isUnique("dog"));
    }
}
