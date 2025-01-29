package Java8.Predicate.PredicateJoining;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullAndEmptyString {
    public static void main(String[] args) {
        String[] stringArray = {
                "Hello", "", "World", null, "Java",
                "Programming", "", "Spring", null, "Framework",
                "Ternary", "", null, "Operator", "Predicate",
                "Data", "", "Structure", null, "Algorithms"
        };
        ArrayList<String> freshString = removeAndEqualString(stringArray);
        System.out.println(freshString);
    }

    private static ArrayList<String> removeAndEqualString(String[] stringArray) {
        Predicate<String> p1 = s-> s==null;
        Predicate<String> p2 = s-> s.equals("");
        ArrayList<String> al = new ArrayList<>();
        for( String s : stringArray){
            Boolean b = (p1.or(p2)).test(s) ? null : al.add(s);
        }
        return al;
    }
}
