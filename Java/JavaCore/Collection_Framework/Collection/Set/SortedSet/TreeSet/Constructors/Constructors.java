package JavaCore.Collection_Framework.Collection.Set.SortedSet.TreeSet.Constructors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Constructors {
    public static void main(String[] args) {
        TreeSet<Integer> t= new TreeSet<>();
        TreeSet<Integer> t2= new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        TreeSet<Integer> t3= new TreeSet<>(new TreeSet<>());
        TreeSet<Integer> t4= new TreeSet<>(new ArrayList<>());

    }
}
