package Java8.Predicate.PredicateJoining;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateJoining {
    public static void check(Predicate<Integer> p , int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        for(int x:arr){
           Boolean b = (p.test(x)) ? al.add(x) : null;
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        Predicate<Integer> p1 = i-> i>10;
        Predicate<Integer> p2 = i-> i%2==0;
        int[] arr = {0,2,4,6,8,12,14,19,25,13,19,15,19};
        System.out.println("Numbers that are greater that");
        check(p1,arr);
        System.out.println("Number that are even");
        check(p2,arr);
        System.out.println("Numbers that are less than 10");
        check(p1.negate(),arr);
        System.out.println("Number that are add");
        check(p2.negate(),arr);
        System.out.println("Number that are even as well as greater than 10");
        check(p1.and(p2),arr);
        System.out.println("Number that are odd as well as greater than 10");
        check(p1.and(p2.negate()),arr);
        System.out.println("Number that are even as well as less than 10");
        check(p1.negate().and(p2.negate()),arr);
        System.out.println("Number that are even or greater than 10");
        check(p1.or(p2),arr);
        System.out.println("Number that are odd as well as greater than 10");
        check(p1.or(p2.negate()),arr);

    }
}
