package Collection_Framework.Collection.List.ArrayList.Methods;

import java.util.ArrayList;

public class Removal_Operations {
    public static ArrayList<Object>  al= new ArrayList<>();

    static void makeList(){
        al.clear();
        al.add("Sayan");
        al.add("Shil");
        al.add("Java");
        al.add("Collections");
        al.add("List");
        al.add("ArrayList");
        al.add(2);
        al.add(497.59);
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Sayan");
        list.add("Shil");
        System.out.println(list);

        makeList();

        al.remove("Java");
        System.out.println(al);

        al.removeAll(list);
        System.out.println(al);


        list.clear();
        System.out.println(list);
        list.add("List");

        al.retainAll(list);
        System.out.println(al);


        makeList();
        System.out.println(al);

        al.remove(0);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);

        // That means everytime the indexing is changing by -1 when a element is popped out


        al.remove(2);
        System.out.println(al);





    }
}
