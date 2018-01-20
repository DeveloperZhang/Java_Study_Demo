package com.company.Locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {
    public static void test(){
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale l :
                locales) {
            System.out.println(l.getDisplayCountry() + "=" + l.getCountry() + " " + l.getDisplayLanguage() + "=" + l.getLanguage());
        }
    }

    public static void testLocale() {
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        ResourceBundle bundle = ResourceBundle.getBundle("com.company.Locale.mess",myLocale);
        System.out.println(bundle.getString("hello"));
    }
}
