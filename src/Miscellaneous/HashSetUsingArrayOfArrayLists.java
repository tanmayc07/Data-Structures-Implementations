/*
 * Author - @tanmayc07
 * Implementation of HashSet using Array of ArrayLists
 * Solution to https://leetcode.com/problems/design-hashset/
 */
package Miscellaneous;
import java.util.*;

class CHashSet {

    ArrayList<Integer>[] al;

    public CHashSet() {
        al = new ArrayList[1000];

        for (int i = 0; i < 1000; i++) {
            al[i] = new ArrayList<Integer>();
        }
    }

    public int hash(int key) {
        return key%1000;
    }

    public void add(int key) {
        if(!this.contains(key)) {
            al[this.hash(key)].add(key);
        }
    }

    public void remove(int key) {
        if(this.contains(key)) {
            al[this.hash(key)].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        if(al[this.hash(key)].size()!=0) {
            for(int i=0; i<al[this.hash(key)].size(); i++) {
                if(al[this.hash(key)].get(i)==key) return true;
            }
        }
        return false;
    }
}

public class HashSetUsingArrayOfArrayLists {
    public static void main(String[] args) {
        CHashSet hs = new CHashSet();
        hs.add(10);
        hs.add(10);
        System.out.println(hs.contains(10));
        hs.add(20);
        hs.remove(10);
        System.out.println(hs.contains(10));
    }
}
