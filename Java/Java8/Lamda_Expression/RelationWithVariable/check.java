package Java8.Lamda_Expression.RelationWithVariable;

import java.util.function.Predicate;

public class check {

    public static void main(String[] args) {
        int age1= 17;
        int age2 = 18;
        Predicate p = (a)-> age1==age2;

        System.out.println(   p.test(age1));
    }
}
