package Collection.List.LinkedList.Methods;

import java.util.LinkedList;

public class Ex_Removal_Operations {
    public static LinkedList<Object> list= new LinkedList<>();
    public static Object obj;

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

       // First Retrieve Then Remove
        obj = list.removeFirst();
        System.out.println(obj);
        System.out.println(list);

        obj = list.removeLast();
        System.out.println(obj);
        System.out.println(list);


    }
}
