package AkPackage;

import java.util.*;

public class Trie<T> {

    public class TrieResult {
        Trie<T> reference;
        boolean done;

        private TrieResult(Trie<T> t, boolean d){
            reference = t;
            done =d;
        }
    }

    HashMap<T, Trie<T>> children;
    boolean isEnd;

    public Trie() {
        children = new HashMap<>();
    }

    public TrieResult search(T[] word) {
        // may need to make something different for string
        Trie<T> curr = this;
        for (T element : word) {
            if (curr.children.get(element) == null) // if element is not present then return null;
                return null;
            curr = curr.children.get(element);
        }
        // -> if curr.isEnd is true that means the word is actually there, so we return the reference of last element.
        return curr.isEnd ? new TrieResult(curr, true) : null;
    }

    public TrieResult insert(T[] word) {
        boolean newElementInserted = false;
        Trie<T> curr = this;
        for (T element : word) {
            if (curr.children.get(element) == null) // if element is not present then create a new Trie and put inside it.;
            {
                curr.children.put(element, new Trie<>());
                newElementInserted = true;
            }
            curr = curr.children.get(element);
        }
        curr.isEnd = true;
        return new TrieResult(curr, newElementInserted);
    }

    public boolean delete(T[] word) {
        return delete(this, word,0);
    }

    // recursion
    public boolean delete(Trie<T> root, T[] word, int index) {
        if (root == null)
            return false; // we have not found the word
        if (index == word.length) // reach the end of the word
        {
            root.isEnd = false; // this word is remove so it's not an end any more
            if (root.children.size() == 0) // checks if root has no children
                root = null; // if root has no children, then keeping root doesn't make any sense
            return  true;
        }

        if(!root.children.containsKey(word[index])) // word is not present in dictionary
            return  false;
        delete(root.children.get(word[index]), word, index + 1);
        // after deletion checcking if root is empty
        if (root.children.size() == 0 && !root.isEnd)
            root = null;
        return true;
    }
}
