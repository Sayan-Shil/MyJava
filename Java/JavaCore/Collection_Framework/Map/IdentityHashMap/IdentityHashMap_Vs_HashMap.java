package JavaCore.Collection_Framework.Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap_Vs_HashMap {
    public static IdentityHashMap<String,Integer> ihm = new IdentityHashMap<>();
    public static HashMap<String,Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        String s1= new String("Sayan");
        String s2= new String("Sayan");

        hm.put(s1,10);
        hm.put(s2,10);
        System.out.println(hm);

        ihm.put(s1,10);
        ihm.put(s2,10);
        System.out.println(ihm);


    }
}
