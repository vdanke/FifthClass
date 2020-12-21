package org.step.collections.map;

import java.util.*;

public class MapRunner {

    public static void main(String[] args) {

    }

    public static void mapExample() {
        Map<Integer, String> idUsernameMap = new HashMap<>();

        idUsernameMap.put(null, "c");
        idUsernameMap.put(1, "b");

        String s = idUsernameMap.get(null);
//        idUsernameMap.compute()
        Set<Map.Entry<Integer, String>> entries = idUsernameMap.entrySet();
    }

    public static void sortedMapExample() {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        Comparator<? super Integer> comparator = sortedMap.comparator();

        Set<Map.Entry<Integer, String>> entries = sortedMap.entrySet();
    }

    public static void navigableMapExample() {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
    }
}
