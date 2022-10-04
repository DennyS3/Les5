import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Les5 {
    public static void main(String[] args) {
        dz1();dz2();dz3();
        dz4();
    }

    /*1. Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый
        элемент на заданное число. Пусть число, на которое будет
        увеличиваться каждый элемент, задается из консоли.*/
    public static void dz1() {
        System.out.println("введите число на сколько увеличить каждый элемент массива:");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int num[][][] = new int[3][3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    num[i][j][k] = k + w;
                }
            }
        }
        System.out.println(Arrays.deepToString(num));
    }

    /*2. Шахматная доска
    Создать программу для раскраски шахматной доски с помощью цикла.
    Создать двумерный массив String'ов 8х8. С помощью циклов задать
    элементам циклам значения B(Black) или W(White).*/
    public static void dz2() {
        System.out.println("Шахматная доска");
        String lan[][] = new String[8][8];
        for (int i = 0; i < lan.length; i++) {
            for (int j = 0; j < lan[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    lan[i][j] = "W";
                } else {
                    lan[i][j] = "B";
                }
                System.out.print(lan[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
    всех элементов массива.*/
    public static void dz3() {
        int[][] num = new int[5][5];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
                sum += num[i][j];
            }
        }
        System.out.println("сумма всех элементов массива равна: " + sum);
    }

    /*4. Создайте двумерный массив целых чисел. Отсортируйте элементы в
        строках двумерного массива по возрастанию.*/
    public static void dz4() {
        System.out.println("Отсортируйте элементы в строках двумерного массива по возрастанию.");
        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
            Arrays.sort(num[i]);
        }
        System.out.println(Arrays.deepToString(num));
    }
}

