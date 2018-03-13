package Lesson1;

import java.util.Calendar;

public class Homework1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 2;
        int d = 1;

        // Hello!
        form(a, b, c, d);
        tens(a, b);
        System.out.println(plusminus(a));
        positive(a);
        hello("Антон");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        leapyear(year);

    }

    static int form(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    static boolean tens(int a, int b) {
        return (a + b) > 10 && (a + b) < 20;
    }

    static String plusminus(int a) {
        if (a >= 0)
            return "положительное";
        else
            return "отрицательное";
    }

    static boolean positive(int a) {
        if (a < 0) ;
        return true;
    }

    static void hello(String s) {
        System.out.println("Привет," + s + "!");
    }

    static void leapyear(int year) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0)
            System.out.println("високосный");
    }

}
