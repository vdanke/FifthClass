package org.step.intarnationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class InterClass {

    public static void main(String[] args) {
        Locale english = new Locale("en", "US");
        Locale locale = new Locale("ru", "RU");
        Locale locale1 = new Locale("kz", "KZ");
        Locale french = new Locale("fr", "FR");

        double number = 9876.598;
        NumberFormat nfGer = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat nfJap = NumberFormat.getNumberInstance(Locale.JAPANESE);
        NumberFormat nfDef = NumberFormat.getNumberInstance(Locale.FRANCE);

        System.out.println(nfDef.format(number));
        System.out.println(nfJap.format(number));
        System.out.println(nfGer.format(number));

        System.out.println(english.getDisplayCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale1.getDisplayCountry());
        System.out.println(french.getDisplayCountry());
        System.out.println(french.getDisplayName());
        System.out.println(locale.getDisplayName());
    }
}
