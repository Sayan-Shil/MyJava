package Collection.Set.HashSet.Methods;

import java.util.HashSet;

public class HashSet_Operations {
    public static HashSet<Integer> h = new HashSet<>();

    public static void main(String[] args) {
        boolean bool= h.add(5);        //  Returns True if able to insert
        System.out.println(bool);
        System.out.println(h);

        bool= h.add(5);                // Returns False if already inserted , can't able to insert
        System.out.println(bool);
        System.out.println(h);




        // Rest All Methods are same as ArrayList
    }

}
