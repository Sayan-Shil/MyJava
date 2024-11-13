package Collection_Framework.List.ArrayList.Methods;

import java.util.ArrayList;

public class Searching_Operations {
    public static ArrayList<Object> al= new ArrayList<>();
    public static boolean bool;

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
        makeList();
        System.out.println(al);

        // Check if "Java" is available or not
        bool = al.contains("Java");
        System.out.println(bool);

        ArrayList<Object> list = new ArrayList<>();
        list.add("Java");
        list.add("List");

        bool = al.containsAll(list);
        System.out.println(bool);


    }
}
