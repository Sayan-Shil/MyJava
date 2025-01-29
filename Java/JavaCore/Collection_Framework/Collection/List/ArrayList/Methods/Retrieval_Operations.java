package JavaCore.Collection_Framework.Collection.List.ArrayList.Methods;

import java.util.ArrayList;

public class Retrieval_Operations {
    public static ArrayList<Object> al= new ArrayList<>();
    public static Object obj;
    public static int index;

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

        // Retrieve First object and 5th Object
        obj = al.getFirst();
        System.out.println(obj);

        obj= al.get(4);
        System.out.println(obj);

        // retrieve the position where Java locates

        index = al.indexOf("Java");
        System.out.println(index);

        al.add("Java");
        System.out.println(al);
        System.out.println(index);

        index = al.lastIndexOf("Java");
        System.out.println(index);

        // retrieve and then replace

        obj = al.set(7,500);
        System.out.println(obj);
        System.out.println(al);



    }
}
