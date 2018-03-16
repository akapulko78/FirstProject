package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        char[] bars = new char[15]; //создаем массив символов
        Arrays.fill(bars, '#'); //метод fill для заполнения массива одинаковыми элементами

        Random rd = new Random();
        int index = rd.nextInt(words.length); //выбираем случайный элемент массива
        String xword = words[index];
        //System.out.println(xword);

        while (true) {
            Scanner scan = new Scanner(System.in);
            String myword = scan.nextLine(); //считываем строку из консоли

            if (myword.equals(xword)) { //сравниваем слова
                System.out.println("Right!");
                break;
            } else {
                for (int i = 0; i < myword.length() && i < xword.length(); i++) {
                    if (xword.charAt(i) == myword.charAt(i)) //сравниваем элементы массива под индексом i
                        bars[i] = myword.charAt(i); //заменяем элемент массива bars элементом из массива myword
                }
                for (char bar : bars) { //цикл foreach для вывода в консоль массива bars
                    System.out.print(bar);
                }
            }
        }
    }
}


