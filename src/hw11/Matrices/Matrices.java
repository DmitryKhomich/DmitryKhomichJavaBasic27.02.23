package hw11.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        System.out.println("Введи два целых числа для создания матриц");
        System.out.println("Переменная М: ");
        if (scanner.hasNextInt()){
            m = scanner.nextInt();
        } else {
            throw new RuntimeException("Ввел не число!");
        }
        System.out.println("Переменная N: ");
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        } else {
            throw new RuntimeException("Ввел не число!");
        }
        int [][] firstArray = new int[m][n];
        int [][] secondArray = new int[n][m];
        System.out.println(Arrays.deepToString(firstArray));
        System.out.println(Arrays.deepToString(secondArray));
    }
}
