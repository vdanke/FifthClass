package org.step.fundamentals.variables;

import java.math.BigDecimal;
import java.math.BigInteger;

public class VariableObjectExample {

    public static void main(String[] args) {
        Byte b = 1;
        Short s = 127;
        Integer i = 123542;
        Long l = 1209487918247L;
        String str = "Some string";

        i++;
        ++i;

        Double d;
        Float f;

        Boolean is;
        Character c;

        BigDecimal bigDecimal = new BigDecimal(1.0);
        BigInteger bigInteger = BigInteger.valueOf(1_000_000_000L);
    }
}
