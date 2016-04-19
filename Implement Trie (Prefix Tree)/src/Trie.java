/**
 * Created by Tony on 2016/4/19.
 */
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode myroot=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(myroot.children[c-'a']==null){
                TrieNode child=new TrieNode(c);
                myroot.children[c-'a']=child;
                myroot=child;
            }
            else{
               myroot=myroot.children[c-'a'];
            }
        }
        myroot.isword = true;
    }
    int a=1;
    int b=2;
    int rest=a==b?a:b;
    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode myroot=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(myroot.children[c-'a']==null){
                return false;
            }
            else{
                myroot=myroot.children[c-'a'];
            }
        }
        return myroot.isword;
    }
}
