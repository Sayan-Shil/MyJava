package Collection_Framework.List.ArrayList.Methods;

import java.util.ArrayList;

public class Adding_Operations {
    public static void main(String[] args) {
        ArrayList<Object> x = new ArrayList<>();
        ArrayList<Object> al = new ArrayList<>();


        al.add("Sayan");
        al.add("Shil");

        x.add("Java");
        x.add("Spring");
        x.add("JavaFX");


        System.out.println(al);
        System.out.println(x);

        al.addAll(x);
        System.out.println(al);

        al.add(2,"Swing");
        System.out.println(al);

        al.addAll(0,x);
        System.out.println(al);

    }
}
