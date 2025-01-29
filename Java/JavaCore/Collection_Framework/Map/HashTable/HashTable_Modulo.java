package JavaCore.Collection_Framework.Map.HashTable;

import java.util.Hashtable;

public class HashTable_Modulo {
    static Hashtable<Integer,String> hash = new Hashtable<>();

    public static void main(String[] args) {
        hash.put(5,"A");
        hash.put(2,"B");
        hash.put(15,"C");
        hash.put(21,"D");
        hash.put(16,"E");
        System.out.println(hash);
    }
}
