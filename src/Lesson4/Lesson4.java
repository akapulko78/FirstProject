package Lesson4;




import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static final int SIZE = 5;
    private static final int DOT_TO_WIN = 4;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char[] players = new char[]{DOT_X, DOT_O};

    private static char[][] map;
    private static int emptyFields;

    public static void main(String[] args) {
        initMap();
        game();
    }

    private static void game() {
        System.out.println("Вы играете X");
        while (true) {
            for (char player : players) {
                if (isFilled()) {
                    System.out.println("Ничья!");
                    return;
                } else if (turn(player)) {
                    System.out.format("%s победил!%n", player);
                    return;
                }
            }
        }
    }

    private static boolean turn(char value) {
        switch (value) {
            case DOT_X:
                humanStep();
                break;
            case DOT_O:
                aiStep();
                break;
            default:
                System.out.println("Неизвестный игрок");
        }
        printMap();
        --emptyFields;
        return haswinner(value);
    }

    private static void printMap() {
        for (char[] row : map) {
            for (char item : row) {
                System.out.print(" " + item);
            }
            System.out.println();
        }
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        emptyFields = SIZE * SIZE;
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map.length; column++) {
                map[row][column] = DOT_EMPTY;
                System.out.print(" " + DOT_EMPTY);
            }
            System.out.println();
        }
    }

    private static boolean isFilled() {
        return emptyFields <= 0;
    }

    private static boolean validate(int row, int column) {
        return row >= 0 && row <= SIZE - 1
                && column >= 0 && column <= SIZE - 1
                && map[row][column] == DOT_EMPTY;
    }

    private static boolean haswinner(char value) {
        return findMaxLengthForRows(value, true) >= DOT_TO_WIN ||
                findMaxLengthForRows(value, false) >= DOT_TO_WIN ||
                findMaxLengthForCenterDiagonal_1(value) >= DOT_TO_WIN ||
                findMaxLengthForCenterDiagonal_2(value) >= DOT_TO_WIN ||
                findMaxLengthForFarDiagonal_1(value) >= DOT_TO_WIN ||
                findMaxLengthForFarDiagonal_2(value) >= DOT_TO_WIN ||
                findMaxLengthForFarDiagonal_3(value) >= DOT_TO_WIN ||
                findMaxLengthForFarDiagonal_4(value) >= DOT_TO_WIN;
    }

    private static int findMaxLengthForRow(int index, char val, boolean row) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = row ? map[index][i] : map[i][index];
            if (c == val)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static int findMaxLengthForRows(char value, boolean row) {
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            maxLength = Math.max(findMaxLengthForRow(i, value, row), maxLength);
        }
        return maxLength;
    }

    private static int findMaxLengthForCenterDiagonal_1(char value) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = map[i][i];
            if (c == value)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static int findMaxLengthForCenterDiagonal_2(char value) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = map[i][SIZE - i - 1];
            if (c == value)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static int findMaxLengthForFarDiagonal_1(char value) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = map[i + 1][i];
            if (c == value)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static int findMaxLengthForFarDiagonal_2(char value) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = map[i][i + 1];
            if (c == value)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static int findMaxLengthForFarDiagonal_3(char value) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = map[i][SIZE - i - 2];
            if (c == value)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static int findMaxLengthForFarDiagonal_4(char value) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            char c = map[i + 1][SIZE - i - 1];
            if (c == value)
                currentLength++;
            else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        return Math.max(currentLength, maxLength);
    }

    private static void humanStep() {
        int row;
        int column;
        do {
            System.out.println("Введите значение строки и столбца," +
                    " в которые вы хотите сходить ([1,3])");
            row = scanner.nextInt() - 1;
            column = scanner.nextInt() - 1;
        } while (!validate(row, column));
        map[row][column] = DOT_X;
    }

    private static void aiStep() {
        int row = 0;
        int column = 0;
        boolean human_WIN = false;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!validate(i, j)) {
                    map[row][column] = DOT_X;
                    if (haswinner(DOT_X)) {
                        row = i;
                        column = j;
                        human_WIN = true;
                    }
                    map[row][column] = DOT_EMPTY;
                }
            }
        }
        if(!human_WIN){
            do {
                row = random.nextInt(SIZE);
                column = random.nextInt(SIZE);
            } while (!validate(row, column));
            System.out.format("Компьютер совершил ход в ячейку %s %s %n", row, column);
            map[row][column] = DOT_O;
    }

    }
}


