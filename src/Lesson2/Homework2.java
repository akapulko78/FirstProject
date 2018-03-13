package Lesson2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        // exercise1:
        int[] arr = {1, 0, 1, 0, 1, 0};
        //так:
/*
или так:
arr[i] = arr[i] == 1?0:1;
*/
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;
        System.out.println(Arrays.toString(arr));

        // exercise2:
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr1));

        // exercise3:
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }

        // exercise4:
        int size = 3;
        int[][] arr3 = new int[size][size];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i][i] = 1;
        }
        for(int[] row : arr3){
            System.out.println(Arrays.toString(row));
        }

        // exercise5:
        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arr4[0];
        int min = arr4[0];
        for (int value : arr4) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }

        // exercise6:

        boolean result = exercise6();
        System.out.println(result ? "Balance" : "NoBalance");
    }

    private static boolean exercise6() {
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int value : arr5) {
            int sumleft = value;
            int sumright = Arrays.stream(arr5).sum() - sumleft;
            sumleft += value + 1;
            if (sumleft == sumright)
                return true;
        }
        return false;
    }

}
