/**
 * Created by Administrator on 2015/6/2.
 */
public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }
    //Ϊ�˷���������Ҿ�ֱ��д����ʼ���Ķ���������ϸ�Ŀ��Լ���ǰ����־
    public void initTree(){

        Node node1 = new Node("a");
        Node node2 = new Node("b");
        Node node3 = new Node("c");
        Node node4 = new Node("d");
        Node node5 = new Node("e");
        root = node1;
        node1.left = node2;
        node2.right = node3;
        node1.right = node4;
        node3.left = node5;
    }
    //������������
    int length(Node root){
        int depth1;
        int depth2;
        if(root == null) return 0;
        //�����������
        depth1 = length(root.right);
        //�����������
        depth2 = length(root.left);
        if(depth1>depth2)
            return depth1+1;
        else
            return depth2+1;
    }
}
