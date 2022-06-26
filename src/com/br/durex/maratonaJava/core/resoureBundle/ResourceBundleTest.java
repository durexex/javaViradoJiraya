package com.br.durex.maratonaJava.core.resoureBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", new Locale("pr", "BR"));
        ResourceBundle bundleUS = ResourceBundle.getBundle("Messages", new Locale("en", "US"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundleUS.getString("hello"));
        System.out.println(bundleUS.getString("good.morning"));
    }
}
