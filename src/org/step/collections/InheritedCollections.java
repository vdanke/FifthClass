package org.step.collections;

import java.util.*;

public class InheritedCollections {

    public static void main(String[] args) {
        EnumSet<EnumExample> enumExamples = EnumSet.allOf(EnumExample.class);

        EnumExample[] values = EnumExample.values();
    }

    public static void inheritedCollections() {
        List<Object> vector = new Vector<>();
        List<Object> stack = new Stack<>();
        Map<Integer, String> hashtable = new Hashtable<>();
        Properties properties = new Properties();
        BitSet bitSet = new BitSet();
        Enumeration s = new StringTokenizer("");
    }

    private static enum EnumExample {
        FIRST, SECOND
    }
}
