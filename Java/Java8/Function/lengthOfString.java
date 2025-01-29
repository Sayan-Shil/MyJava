package Java8.Function;

import java.util.ArrayList;
import java.util.function.Function;

public class lengthOfString {
    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");
        names.add("Frank");
        names.add("Grace");
        names.add("Hannah");
        names.add("Ivy");
        names.add("Jack");

        Function<String,Integer> f1 = s -> s.length();
        for( String s : names){
            System.out.println(f1.apply(s));
        }
    }
}
