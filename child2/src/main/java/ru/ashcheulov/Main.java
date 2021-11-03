package ru.ashcheulov;

public class Main {

    public static void main(String... a) {
        var myAwesomeClassInstance = MyAwesomeClass.getInstance();
        var randomStringForRegex = myAwesomeClassInstance.getRandomStringForRegex("[0-1]{4}");
        myAwesomeClassInstance.printString(randomStringForRegex);
    }
}
