package ru.ashcheulov;

import com.mifmif.common.regex.Generex;

import java.util.Objects;

public class MyAwesomeClass {

    private static final MyAwesomeClass myAwesomeClass = null;

    private MyAwesomeClass() {
    }

    public static MyAwesomeClass getInstance() {
        return Objects.requireNonNullElseGet(myAwesomeClass, MyAwesomeClass::new);
    }

    public void printString(String str) {
        System.out.printf("===%s===",str);
    }

    public String getRandomStringForRegex(String regex) {
        return new Generex(regex).random();
    }
}
