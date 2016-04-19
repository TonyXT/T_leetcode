/**
 * Created by Tony on 2016/4/19.
 */
class TrieNode {
    // Initialize your data structure here.
    boolean isword;
    char val;
    TrieNode[] children=new TrieNode[26];
    TrieNode(char c){
        this.val=c;
    }
    public TrieNode() {}
}