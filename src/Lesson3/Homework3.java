package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //Scanner sc = new Scanner(System.in);
       // String b = sc.nextLine();
        Random rd = new Random();
        int index = rd.nextInt(words.length);
        String xword = words[index];
        System.out.println(xword);
    }


}

