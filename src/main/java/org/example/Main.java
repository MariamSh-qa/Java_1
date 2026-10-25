package org.example;

import javax.print.DocFlavor;
import java.util.Locale;

public class Main {
    static void main(String[] args) {
        int x = 25;
        char symbol = 'A';

        //1.
        String studentName = "This house is so beautiful";
        System.out.println(studentName.toUpperCase());   //From lower case to upper case.

        //2.
        String studentSecondName = "THIS HOUSE IS SO BEAUTIFUL";
        System.out.println(studentSecondName.toLowerCase()); //From upper case to lower case.

        //3.
        String studentThirdName = "This house is so beautiful";
        System.out.println(studentThirdName.length()); //How much length is the words include spaces.

        //4.
        String someoneFirst = "My house";
        System.out.println(someoneFirst.indexOf("o")); //counting starting from 0, includes space.

        //5.
        String someoeneSecond = "My house";
        System.out.println(someoeneSecond.charAt(2)); //counting starting from 0, includes space.

        //6. Contains
        String someoneThird = "house";
        System.out.println(someoneThird.contains("h"));
        System.out.println(someoneThird.contains("o"));
        System.out.println(someoneThird.contains("1"));
        System.out.println(someoneThird.contains("ho"));
        System.out.println(someoneThird.contains("house"));

        //7. Replace letter.
        System.out.println(someoneThird.replace('h','m')
        );





    }
}