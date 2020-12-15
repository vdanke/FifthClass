package org.step.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
}
