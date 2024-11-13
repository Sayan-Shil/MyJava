package Collection_Framework.Set.SortedSet.NavigableSortedSet;

import java.util.TreeSet;

public class TreeSet_Navigation {
    public static TreeSet<Integer> tree = new TreeSet<>();
    public static Integer i;

    public static void main(String[] args) {
        tree.add(5);
        tree.add(6);
        tree.add(4);
        tree.add(10);
        tree.add(14);
        tree.add(1);
        tree.add(18);
        tree.add(7);
        tree.add(8);
        tree.add(15);

        System.out.println(tree);

        i = tree.floor(10);
        System.out.println(i);

        i = tree.lower(10);
        System.out.println(i);

        i = tree.ceiling(10);
        System.out.println(i);

        i = tree.higher(10);
        System.out.println(i);

        i = tree.pollFirst();
        System.out.println(i);
        System.out.println(tree);

        i = tree.pollLast();
        System.out.println(i);
        System.out.println(tree);

      tree = (TreeSet<Integer>) tree.descendingSet();
        System.out.println(tree);




    }

}
