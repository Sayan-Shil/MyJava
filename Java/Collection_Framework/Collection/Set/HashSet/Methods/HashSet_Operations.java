package Collection_Framework.Collection.Set.HashSet.Methods;

import java.util.HashSet;

public class HashSet_Operations {
    public static HashSet<Object> h = new HashSet<>();

    public static void main(String[] args) {
        boolean bool= h.add(5);        //  Returns True if able to insert
        System.out.println(bool);
        System.out.println(h);

        bool= h.add(5);                // Returns False if already inserted , can't able to insert
        System.out.println(bool);
        System.out.println(h);

        System.out.println(h);


        h.add("Sayan");
        h.add("Shil");
        h.add(52);
        h.add(78.98);
        h.add(true);


        System.out.println(h);    // Insertion Order is not preserved

        // Rest All Methods are same as ArrayList but indexing not allowed.
    }

}
