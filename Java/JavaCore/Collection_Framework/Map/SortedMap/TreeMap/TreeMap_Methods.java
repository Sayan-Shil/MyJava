package JavaCore.Collection_Framework.Map.SortedMap.TreeMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Methods {
    static TreeMap<String,Integer> tree= new TreeMap<>();


    static void fillTreeMap(){
        tree.clear();
        tree.put("Shuvra",34);
        tree.put("Sahoo",40);
        tree.put("Arnab",57);
        tree.put("Sayan",61);
        tree.put("Bibek",62);

    }


    public static void main(String[] args) {
        // Basics Of Map

        //Addition
        fillTreeMap();
        tree.put("Anonymous",12);
        System.out.println(tree);

         TreeMap<String,Integer> tree2= new TreeMap<>();
         tree2.put("Apple",120);
         tree2.put("Mango",80);

         tree.putAll(tree2);
        System.out.println(tree);

        // Removal and Retrieval

        tree.remove("Anonymous");      //Returns removed objects
        System.out.println(tree);

       boolean b= tree.containsKey("Sayan");
        System.out.println(b);
        b= tree.containsValue(57);
        System.out.println(b);


        // Sizing

        b= tree.isEmpty();
        System.out.println(b);

        int i = tree.size();
        System.out.println(i);

        // Collection View
        Set<String> set = tree.keySet();
        System.out.println(set);


        Collection<Integer> collection = tree.values();
        System.out.println(collection);

        Set<Map.Entry<String, Integer>> entry = tree.entrySet();
        System.out.println(entry);


        // SortedMap Methods

        fillTreeMap();

        String val = tree.firstKey();
        System.out.println(val);

        val=tree.lastKey();
        System.out.println(val);

        Map<String,Integer> m = tree.headMap("Sayan");
        System.out.println(m);

        m = tree.tailMap("Sayan");
        System.out.println(m);

        m = tree.subMap("Bibek","Shuvra");
        System.out.println(m);

        // Navigable Set Methods

        String key = tree.floorKey("Sayan");
        System.out.println(key);
        key = tree.lowerKey("Sayan");
        System.out.println(key);

        key = tree.ceilingKey("Sayan");
        System.out.println(key);

        key = tree.higherKey("Sayan");
        System.out.println(key);

        tree.pollFirstEntry();
        System.out.println(tree);

        tree.pollLastEntry();
        System.out.println(tree);

        fillTreeMap();
        System.out.println(tree);
        System.out.println(tree.descendingMap());

    }
}
