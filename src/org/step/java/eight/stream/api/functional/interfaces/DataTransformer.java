package org.step.java.eight.stream.api.functional.interfaces;

import java.nio.charset.StandardCharsets;

@FunctionalInterface
public interface DataTransformer<T, P> {

    P transform(T t);

    static Integer transformStringToInteger(String str) {
        return str.length();
    }

    static byte[] transformToBytes(Object o) {
        return o.toString().getBytes(StandardCharsets.UTF_8);
    }

    default <Z> String transformGenericMethod(Z z) {
        return z.getClass().getName();
    }
}
