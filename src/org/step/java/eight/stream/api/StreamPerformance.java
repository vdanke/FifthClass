package org.step.java.eight.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPerformance {

    public static void main(String[] args) {
        PerformanceProcessor processor = new PerformanceProcessor();

        long oldWay = System.currentTimeMillis();
        List<Long> longList1 = processor.performOldWay();
        System.out.println((System.currentTimeMillis() - oldWay));

        processor = new PerformanceProcessor();

        long newWay = System.currentTimeMillis();
        List<Long> longList2 = processor.performModernWay();
        System.out.println((System.currentTimeMillis() - newWay));
    }

    public static class PerformanceProcessor {
        private List<Long> longList;

        public PerformanceProcessor() {
            this.longList = new ArrayList<>();
            for (long i = 0; i < 1_000_000_00; i++) {
                longList.add(i);
            }
        }

        public List<Long> performOldWay() {
            List<Long> list = new ArrayList<>();

            for (Long l : longList) {
                if (l % 250 == 0) {
                    list.add(l);
                }
            }
            longList = new ArrayList<>();
            return list;
        }

        public List<Long> performModernWay() {
            List<Long> collect = longList.parallelStream()
                    .unordered()
                    .filter(l -> (l % 250) == 0)
                    .collect(Collectors.toList());
            longList = new ArrayList<>();
            return collect;
        }
    }
}
