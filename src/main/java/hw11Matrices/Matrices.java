package main.java.hw11Matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public static void fillMatrice(int [][] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = random.nextInt(11);
            }
        }
    }

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
        fillMatrice(firstArray);

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                secondArray[i][j] = firstArray[j][i];
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
