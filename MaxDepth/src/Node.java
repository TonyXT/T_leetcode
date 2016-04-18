/**
 * Created by Administrator on 2015/6/2.
 */
public class Node {
    String name;
    Node left;
    Node right;
    public Node(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
