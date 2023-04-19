package main.java.hw7GuessTheNumber;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessTheNumber {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Угадай целое число, которое я загадал от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random()*10);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("У тебя 3 попытки");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Введи число, попытка 1: ");
        if (scanner.hasNextInt()){
            if(scanner.nextInt() == secretNumber){
                System.out.println("Ты угадал, поздравляю!");
               return;
            }else{
                System.out.println("Ты не угадал! Осталось 2 попытки");
            }
        }else{
            throw new RuntimeException("Ты ввел не целое число!");
        }
        if (scanner.hasNextInt()){
            if(scanner.nextInt() == secretNumber){
                System.out.println("Ты угадал, поздравляю!");
                return;
            }else{
                System.out.println("Ты не угадал! Осталось 1 попытка");
            }
        }else{
            throw new RuntimeException("Ты ввел не целое число!");
        }
        if (scanner.hasNextInt()){
            if(scanner.nextInt() == secretNumber){
                System.out.println("Ты угадал, поздравляю!");
                return;
            }else{
                System.out.println("Ты не угадал! Программа завершина");
            }
        }else{
            throw new RuntimeException("Ты ввел не целое число!");
        }
    }
}
