package org.step.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleExample {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle
                .getBundle("languages", new Locale("ru", "RU"));

        String hello = bundle.getString("hello");

        System.out.println(hello);
    }
}
