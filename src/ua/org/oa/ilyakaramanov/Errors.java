package ua.org.oa.ilyakaramanov;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Класс демонстрирует возникновение ошибок
 */

public class Errors {

    /*
    Метод демонстрирует ошибку ArrayIndexOutOfBoundsException
     */
    void arrayIndex() {
        String[] test = new String[0];
        try {
            System.out.println(test[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Method arrayIndex: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку IllegalArgumentException
     */
    void illegalArgument() {
        String test = "test";
        try {
            Array.getBoolean(test, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Method illegalArgument: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку ClassCastException
     */
    void classCast() {
        Object test = new Double(11.1);
        try {
            System.out.println((String) test);
        } catch (ClassCastException e) {
            System.out.println("Method classCast: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку StringIndexOutOfBoudException
     */
    void stringIndex() {
        String test = "abc";
        try {
            System.out.println(test.charAt(-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Method stringIndex: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку NullPointerException
     */
    void nullPoiter1() {
        Main main = null;
        try {
            System.out.println(main.getClass());
        } catch (NullPointerException e) {
            System.out.println("Method nullPoiter1: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку NullPointerException
     */
    void nullPoiter2() {
        String test = null;
        try {
            test.length();
        } catch (NullPointerException e) {
            System.out.println("Method nullPoiter2: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку NullPointerException
     */
    void nullPoiter3() {
        String[] test = new String[5];
        try {
            test[2].length();
        } catch (NullPointerException e) {
            System.out.println("Method nullPoiter3: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку StackOverflowError
     */
    void stackOverflow() {
        try {
            stackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Method stackOverflow: " + e);
        }

    }

    /*
    Метод демонстрирует ошибку NumberFormatException
     */
    void numberFormat() {
        try {
            int a = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println("Method numberFormat: " + e);
        }
    }

    /*
    Метод демонстрирует ошибку OutOfMemoryError
     */
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


