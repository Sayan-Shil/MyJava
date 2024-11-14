package Collection_Framework.Map.HashMap.Constructors;

import java.util.HashMap;
import java.util.Map;

public class Constructors {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        HashMap<Integer,String> hm2 = new HashMap<>(new HashMap<>());
        HashMap<Integer,String> hm3 = new HashMap<>(50);
        HashMap<Integer,String> hm4 = new HashMap<>(50,0.25F);
    }
}
