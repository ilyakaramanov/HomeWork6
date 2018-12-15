package ua.org.oa.ilyakaramanov;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Errors {

    void arrayIndex() {
        String[] test = new String[0];
        try {
            System.out.println(test[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Method arrayIndex: " + e);
        }
    }

    void illegalArgument() {
        String test = "test";
         try {
             Array.getBoolean(test, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Method illegalArgument: " + e);
        }
    }

    void classCast() {
        Object test = new Double(11.1);
        try {
            System.out.println((String) test);
        } catch (ClassCastException e) {
            System.out.println("Method classCast: " + e);
        }
    }

    void stringIndex() {
        String test = "abc";
        try {
            System.out.println(test.charAt(-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Method stringIndex: " + e);
        }
    }

    void nullPoiter1() {
        Main main = null;
        try {
            System.out.println(main.getClass());
        } catch (NullPointerException e) {
            System.out.println("Method nullPoiter1: " + e);
        }
    }

    void nullPoiter2() {
        String test = null;
        try {
            test.length();
        } catch (NullPointerException e) {
            System.out.println("Method nullPoiter2: " + e);
        }
    }

    void nullPoiter3() {
        String[] test = new String[5];
        try {
            test[2].length();
        } catch (NullPointerException e) {
            System.out.println("Method nullPoiter3: " + e);
        }
    }

    void stackOverflow() {
        try {
            stackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Method stackOverflow: " + e);
        }

    }

    void numberFormat() {
        try {
            int a = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println("Method numberFormat: " + e);
        }
    }

    void outOfMemory() {
        ArrayList<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("qwerty");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Method outOfMemory: " + e);
        }
    }

}


