package Collection_Framework.Map.HashMap.Methods;

import java.util.*;

public class HashMap_Operations {
    public static HashMap<Integer, String> hm = new HashMap<>();
    public static Object key;
    public static Object value;

    public static void fillObjects(){
        hm.clear();
        hm.put(34,"Shuvradip");
        hm.put(40,"Sahoo");
        hm.put(57,"Arnab");
        hm.put(61,"Sayan");
        hm.put(62,"Bibek");
    }

    public static void main(String[] args) {

        // ADDING or REPLACING

        hm.put(34,"Shuvradip");
        hm.put(40,"Sahoo");
        hm.put(57,"Arnab");
        hm.put(61,"Sayan");
        hm.put(62,"Bibek");

        System.out.println(hm);

        // RETRIEVAL or REMOVAL

        value = hm.get(62);
        System.out.println(value);

        value = hm.remove(34);
        System.out.println(value);
        System.out.println(hm);


        // SEARCHING

        boolean bool = hm.containsKey(34);
        System.out.println(bool);

        bool = hm.containsValue("Sayan");
        System.out.println(bool);


        // SIZING

        bool = hm.isEmpty();
        System.out.println(bool);

        value = hm.size();
        System.out.println(value);

        hm.clear();
        System.out.println(hm);


        // COLLECTION VIEW METHODS

        fillObjects();
        System.out.println(hm);

        Set<Integer> hs = hm.keySet();
        System.out.println(hs);

        Collection<String> o = hm.values();
        System.out.println(o);

        Set s = hm.entrySet(); // Or use generic version of Set<Map.Entry<Integer,String>>
        System.out.println(s);


        // ENTRY LEVEL METHODS

        Set<Map.Entry<Integer,String>> s1 = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = s1.iterator();

        while(itr.hasNext()){
            Map.Entry<Integer,String> m1 = (Map.Entry<Integer,String>) itr.next();
            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
            System.out.println(m1.setValue("Mr. "+ m1.getValue()));
            System.out.println(m1);
        }
    }

}
