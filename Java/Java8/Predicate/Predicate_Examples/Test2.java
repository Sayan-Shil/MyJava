package Java8.Predicate.Predicate_Examples;

import java.util.function.Predicate;

// Check Voting Eligibility
public class Test2 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i>=18;
        int i = 14;
        System.out.println(p.test(i) ? "Yes, Eligible For Vote" : "No,Not Eligible For Vote");
    }
}
