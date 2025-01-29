package Java8.Predicate.Predicate_Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Check whether a object is empty or not
public class Test3 {
    public static void main(String[] args) {
        Predicate<List> p = o -> o.isEmpty();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(p.test(al));
        al.add(10);
        System.out.println(p.test(al));
    }
}
