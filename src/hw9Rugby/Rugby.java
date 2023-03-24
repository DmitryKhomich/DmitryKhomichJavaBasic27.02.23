package hw9Rugby;

import java.util.Random;

public class Rugby {

    public static void fillRandomNumbersFrom18To40(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(23) + 18;
        }
    }

    public static double averageAge(int[] array){
        double result;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        result = (double) sum / array.length;
        return result;
    }

    public static void main(String[] args) {
        int [] firstTeam = new int[25];
        int [] secondTeam = new int[25];
        fillRandomNumbersFrom18To40(firstTeam);
        fillRandomNumbersFrom18To40(secondTeam);
        System.out.println("Средний возраст первой команды: " + averageAge(firstTeam));
        System.out.println("Средний возраст второй команды: " + averageAge(secondTeam));

    }


}
