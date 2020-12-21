package org.step.collections;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        Map<Integer, String> objectObjectMap = Collections.emptyMap();
        List<Object> objects = Collections.emptyList();
        Set<Object> objects1 = Collections.emptySet();

        Collections.sort(objects, new Comparator<Object>() {
            @Override
            public int compare(Object o, Object t1) {
                return o.hashCode() - t1.hashCode();
            }
        });
        Collections.reverse(objects);
        // equals ( == )
        Collections.fill(objects, new Object());
//        Collections.swap(objects, 1, 2);

        Set<Object> objects2 = Collections.unmodifiableSet(objects1);
        int frequency = Collections.frequency(objects, new Object());
        List<Object> objects3 = Collections.synchronizedList(objects);
    }
}
