package hw4Parallelepiped;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        int length, width, height, volume;
        System.out.println("Программа параллелепидет приветствует тебя!");
        System.out.println("Обозначь длину целым числом: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt())
            length = scanner.nextInt();
        else {
            throw new RuntimeException("Вы ввели не целое число!");
        }
        System.out.println("Обозначь ширину целым числом: ");
        if (scanner.hasNextInt())
            width = scanner.nextInt();
        else {
            throw new RuntimeException("Вы ввели не целое число!");
        }
        System.out.println("Обозначь высоту целым числом: ");
        if (scanner.hasNextInt())
            height = scanner.nextInt();
        else {
            throw new RuntimeException("Вы ввели не целое число!");
        }
        volume = width * length * height;
        System.out.println("Объем параллелепипеда = " + volume);
    }
}
