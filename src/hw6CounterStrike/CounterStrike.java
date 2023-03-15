package hw6CounterStrike;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CounterStrike {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String firstTeamName, secondTeamName;
        int firstFragFirstTeam, secondFragFirstTeam, thirdFragFirstTeam, fourthFragFirstTeam, fifthFragFirstTeam;
        int firstFragSecondTeam, secondFragSecondTeam, thirdFragSecondTeam, fourthFragSecondTeam, fifthFragSecondTeam;
        int[] allFragsFirstTeam, allFragsSecondTeam;
        int totalFragsSumFirstTeam = 0, totalFragsSumSecondTeam = 0;
        final double avrgScoreFirstTeam;
        final double avrgScoreSecondTeam;

        System.out.println("Введи название первой команды: ");
        if (scanner.hasNextLine()){
            firstTeamName = scanner.nextLine();
        } else {
            throw new RuntimeException("Ты ввел не название");
        }

        System.out.println("Введи первый фраг: ");
        if (scanner.hasNextInt()){
            firstFragFirstTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи второй фраг: ");
        if (scanner.hasNextInt()){
            secondFragFirstTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи третий фраг: ");
        if (scanner.hasNextInt()){
            thirdFragFirstTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи четвертый фраг: ");
        if (scanner.hasNextInt()){
            fourthFragFirstTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи пятый фраг: ");
        if (scanner.hasNextInt()){
            fifthFragFirstTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи название второй команды: ");
        if (scanner.hasNextLine()){
            scanner.nextLine();
            secondTeamName = scanner.nextLine();
        } else {
            throw new RuntimeException("Ты ввел не название");
        }

        System.out.println("Введи первый фраг: ");
        if (scanner.hasNextInt()){
            firstFragSecondTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи второй фраг: ");
        if (scanner.hasNextInt()){
            secondFragSecondTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи третий фраг: ");
        if (scanner.hasNextInt()){
            thirdFragSecondTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи четвертый фраг: ");
        if (scanner.hasNextInt()){
            fourthFragSecondTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        System.out.println("Введи пятый фраг: ");
        if (scanner.hasNextInt()){
            fifthFragSecondTeam = scanner.nextInt();
        } else {
            throw new RuntimeException("Ты ввел не число");
        }

        allFragsFirstTeam = new int[]{firstFragFirstTeam,secondFragFirstTeam,thirdFragFirstTeam,fourthFragFirstTeam,fifthFragFirstTeam};
        for (int i = 0; i < allFragsFirstTeam.length; i++) {
            totalFragsSumFirstTeam += allFragsFirstTeam[i];
        }
        allFragsSecondTeam = new int[]{firstFragSecondTeam,secondFragSecondTeam,thirdFragSecondTeam,fourthFragSecondTeam,fifthFragSecondTeam};
        for (int i = 0; i < allFragsSecondTeam.length; i++) {
            totalFragsSumSecondTeam += allFragsSecondTeam[i];
        }
        avrgScoreFirstTeam = (double) totalFragsSumFirstTeam / allFragsFirstTeam.length;
        avrgScoreSecondTeam = (double) totalFragsSumSecondTeam / allFragsSecondTeam.length;

        if(avrgScoreFirstTeam > avrgScoreSecondTeam){
            System.out.println("Победила команда " + firstTeamName + " набрала " + avrgScoreFirstTeam + " очков");
        } else if (avrgScoreFirstTeam == avrgScoreSecondTeam) {
            System.out.println("Ничья");
        } else {
            System.out.println("Победила команда " + secondTeamName + " набрала " + avrgScoreSecondTeam + " очков");
        }
    }
}
