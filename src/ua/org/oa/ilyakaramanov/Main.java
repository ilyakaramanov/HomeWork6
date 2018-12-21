package ua.org.oa.ilyakaramanov;

/*
Класс запускает методы класса Errors
 */
public class Main {

    public static void main(String[] args) {

        Errors errors = new Errors();       //создаю объект класса Errors

        errors.arrayIndex();
        errors.illegalArgument();
        errors.classCast();
        errors.stringIndex();
        errors.nullPoiter1();
        errors.nullPoiter2();
        errors.nullPoiter3();
        errors.stackOverflow();
        errors.numberFormat();
        errors.outOfMemory();
    }
}
