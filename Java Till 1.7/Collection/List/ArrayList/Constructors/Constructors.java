package Collection.List.ArrayList.Constructors;

import java.util.ArrayList;

public class Constructors {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(20);
        al1.add(10);
        al1.add(20);
        ArrayList<Integer> al3 = new ArrayList<>(al1);
        System.out.println(al3);

    }
}
