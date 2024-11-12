package Collection.Set.HashSet.Constructors;

import java.util.HashSet;

public class Constructors {
    HashSet<Integer> h1 = new HashSet<>();
    HashSet<Integer> h2 = new HashSet<>(new HashSet<>());
    HashSet<Integer> h3 = new HashSet<>(20);
    HashSet<Integer> h4 = new HashSet<>(20, 0.54F);
}
