package Collection.Set.LinkedHashSet.Methods;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSet_Operations {
    public static LinkedHashSet<Object> lhs = new LinkedHashSet<>();



    public static void main(String[] args) {

        lhs.add("Sayan");
        lhs.add("Shil");
        lhs.add(52);
        lhs.add(52);
        lhs.add(78.98);
        lhs.add(true);


        System.out.println(lhs);    // Insertion Order is preserved



    }
}
