package JavaCore.Collection_Framework.Collection.List.ArrayList.Methods;

import java.util.ArrayList;

public class Sizing_Operations {
    public static ArrayList<Object> al= new ArrayList<>();
    public static int size;
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

        size=al.size();
        System.out.println(size);

        bool= al.isEmpty();
        System.out.println(bool);

        al.clear();
        bool= al.isEmpty();
        System.out.println(bool);

    }
}
