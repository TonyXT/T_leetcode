import java.util.HashMap;

/**
 * Created by tangni on 3/28/16.
 */
public class LRUCache {
    private class Node{
        Node prev;
        Node next;
        int key;
        int value;

        public Node(int key, int value){
            this.key=key;
            this.value=value;
            this.prev=null;
            this.next=null;
        }

    }
    private int capacity;
    HashMap<Integer,Node> hm=new HashMap<Integer,Node>();
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(!hm.containsKey(key)) return-1;
        Node current=hm.get(key);
        current.prev.next=current.next;
        current.next.prev=current.prev;
        
        return current.value;
    }

    public void set(int key, int value) {
        if(get(key)!=-1){
            hm.get(key).value=value;
            return;
        }
        if(hm.size()==capacity){
            hm.remove(head.next.key);
            head.next=head.next.next;
            head.next.prev=head;
        }
        Node node=new Node(key,value);
        hm.put(key,node);
        movetotail(node);
    }

    private void movetotail(Node current){
        current.prev = tail.prev;
        tail.prev = current;
        current.prev.next = current;
        current.next = tail;
    }
}
