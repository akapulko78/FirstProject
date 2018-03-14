package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String str = "###############";
        char[] charArray = str.toCharArray();

        Random rd = new Random();
        int index = rd.nextInt(words.length);
        String xword = words[index];
        System.out.println(xword);

        Scanner scan = new Scanner(System.in);
        String myword = scan.nextLine();


        if (myword.equals(xword))
            System.out.println("Right!");
        else {
            for (int i = 0; i < myword.length()||i<xword.length(); i++) {
                if (xword.charAt(i) == myword.charAt(i))
                    charArray[i] = myword.charAt(i);
                }
            for (int i = 0; i <charArray.length ; i++) {
                System.out.println(charArray[i]);
            }
            }
        }
    }


