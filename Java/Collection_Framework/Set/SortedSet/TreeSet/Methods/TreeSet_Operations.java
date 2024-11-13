package Collection_Framework.Set.SortedSet.TreeSet.Methods;

import java.util.TreeSet;

public class TreeSet_Operations {
    public static TreeSet<Integer> tree = new TreeSet<>();

    public static void main(String[] args) {
        tree.add(5);
        tree.add(6);
        tree.add(4);
        tree.add(10);
        tree.add(14);


        System.out.println(tree);

        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.headSet(7));
        System.out.println(tree.tailSet(8));
        System.out.println(tree.subSet(4,9));
    }

}
