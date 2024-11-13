package Collection_Framework.List.ArrayList.Methods;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration_Operations {
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

        Iterator<Object> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
