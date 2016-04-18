import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/9.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("63/Rc");
        list.add("h");
        list.add("BmI3FS~J9#vmk");
        list.add("7uBZ?7*/");
        list.add("24h+X");
        list.add("O ");
        Codec codec=new Codec();
        codec.decode(codec.encode(list));
    }
}
