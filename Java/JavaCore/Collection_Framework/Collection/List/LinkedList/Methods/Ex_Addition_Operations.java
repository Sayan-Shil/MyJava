package JavaCore.Collection_Framework.Collection.List.LinkedList.Methods;

import java.util.LinkedList;

public class Ex_Addition_Operations {
    public static LinkedList<Object> list= new LinkedList<>();
    public static boolean bool;

    static void makeList(){
        list.clear();
        list.add("Sayan");
        list.add("Shil");
        list.add("Java");
        list.add("Collections");
        list.add("List");
        list.add("LinkedList");
        list.add(61);
        list.add(500.00);
    }
    public static void main(String[] args) {
        makeList();
        System.out.println(list);
            list.addFirst("Mr.");
            list.addLast(8999);
        System.out.println(list);
    }
}
