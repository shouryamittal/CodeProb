import java.util.ArrayList;
import java.util.List;
//Q : Implementation of Trie Data Structure.
public class StringTrie {
    public static void main(String ...s) {
        List<String> strings = new ArrayList<String>();
        strings.add("pasrt");
        strings.add("woi");
        Trie trie = new Trie();
        strings.forEach(str ->trie.insert(""));
        System.out.println(trie.search("uiouo"));
        System.out.println(trie.startsWith("wi"));
    }
}

class Trie {
    TrieNode root;
    Trie(){
        this.root = new TrieNode();
    }

    public boolean search(String s){
        TrieNode current = root; //-pqsr //-wert
        for(int i = 0 ; i < s.length(); i++){
            if(current == null){
                return false;
            }
            current = current.next(s.charAt(i));
        }
        if(current.terminating <= 0){
            return false;
        }
        return true;
    }

    public void insert(String s) {
        TrieNode current = root;
        for(int i = 0 ; i < s.length(); i++) {
            if(current.children[s.charAt(i) - 'a'] == null){
                current.children[s.charAt(i) - 'a'] = new TrieNode();
            }
            current = current.next(s.charAt(i));
        }

        current.terminating++;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(int i = 0 ; i < prefix.length(); i++) {
            if(current.children[prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            current = current.next(prefix.charAt(i));
        }
        return true;
    }
}

class TrieNode {
    int terminating;
    final TrieNode children[] = new TrieNode[26];

    public TrieNode next(char c) {
        return this.children[c - 'a'];
    }
}