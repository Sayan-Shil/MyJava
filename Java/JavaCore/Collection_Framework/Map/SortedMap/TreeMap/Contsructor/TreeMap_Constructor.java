package JavaCore.Collection_Framework.Map.SortedMap.TreeMap.Contsructor;

import java.util.*;

public class TreeMap_Constructor {
    public static void main(String[] args) {
        TreeMap<String,String> t1 = new TreeMap<>();
        TreeMap<String,String> t2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        TreeMap<String,String> t3 = new TreeMap<>(new Map<String, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return "";
            }

            @Override
            public String put(String key, String value) {
                return "";
            }

            @Override
            public String remove(Object key) {
                return "";
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return Set.of();
            }

            @Override
            public Collection<String> values() {
                return List.of();
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
                return Set.of();
            }
        });
        TreeMap<String,String> t4 = new TreeMap<>(new SortedMap<String, String>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedMap<String, String> subMap(String fromKey, String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, String> headMap(String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, String> tailMap(String fromKey) {
                return null;
            }

            @Override
            public String firstKey() {
                return "";
            }

            @Override
            public String lastKey() {
                return "";
            }

            @Override
            public Set<String> keySet() {
                return Set.of();
            }

            @Override
            public Collection<String> values() {
                return List.of();
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
                return Set.of();
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return "";
            }

            @Override
            public String put(String key, String value) {
                return "";
            }

            @Override
            public String remove(Object key) {
                return "";
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }
        });

    }

}
