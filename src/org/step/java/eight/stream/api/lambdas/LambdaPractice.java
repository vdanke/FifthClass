package org.step.java.eight.stream.api.lambdas;

import org.step.java.eight.stream.api.functional.interfaces.DataTransformer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaPractice {

    /*
    String[] array = new String[]{"bca", "bc", "a", "adsdasd", "dsadwq", "dasdqweqfdfsdf"};

        Arrays.sort(array, (final String s1, @ExampleAnnotation String s2) -> s1.length() - s2.length());
        Arrays.sort(array, Comparator.comparingInt(String::length));

        for (String str : array) {
            System.out.println(str);
        }

        linksExample();
     */
    public static void main(String[] args) {
        String data = "Test data";

        Function<String , StringBuffer> processingImpl = s -> {
            StringBuffer stringBuffer = new StringBuffer(1000);
            stringBuffer.append(s);
            return stringBuffer;
        };

        Function<String, StringBuffer> processingImplWithPrefix = s -> {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("/").append(s).append("/");
            return stringBuffer;
        };

        StringBuffer processing = processing(data, StringBuffer::new);
        StringBuffer processing1 = processing(data, processingImpl);
        StringBuffer processing2 = processing(data, processingImplWithPrefix);
    }

    public static void defaultLambdaDeclaration() {
        Runnable runnable = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Here");
        };
        Callable<String> callable = () -> {
            Thread.sleep(100);
            return "";
        };
    }

    public static void linksExample() {
        Consumer<String> first = s -> System.out.println(s);
        /*
        System.out.println(T t) s (String) ->
         */
        Consumer<String> second = System.out::println;

        Integer[] array = new Integer[]{1, 5, 12, 3, 4, 6, 65, 53, 49};

        /*
        1.compareTo(5), 5.compareTo(12), 12.compareTo(3)
         */
        Arrays.sort(array, Integer::compareTo);

        for (Integer i : array) {
            System.out.println(i);
        }

        DataTransformer<String, Integer> functionImpl = s -> {
            if (s == null) {
                return 0;
            }
            if (s.length() > 1000) {
                return -1;
            }
            return 1;
        };

        Integer custom = Optional.of("Custom")
                .map(functionImpl::transform).get();

        Supplier<StringBuilder> consumerString = StringBuilder::new;

        Function<String, StringBuffer> function = StringBuffer::new;
    }

    public static StringBuffer processing(String data, Function<String, StringBuffer> function) {
        return function.apply(data);
    }

//    public static void comparatorExample(String[] array, Comparator<String> comparator) {
//        Arrays.sort(array, comparator);
//    }
}
