/**
 * Created by Tony on 2016/4/30.
 */
class Node {

    int data;
    Node left, right, nextRight;

    Node(int item) {
        data = item;
        left = right = nextRight = null;
    }
}