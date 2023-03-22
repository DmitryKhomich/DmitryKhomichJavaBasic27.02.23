package hw10Lottery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int [] ownerLotteryNumbers = new int[7];
        int [] gamersNumbers = new int[7];
        Random random = new Random();

        for(int i =0 ; i < ownerLotteryNumbers.length; i++ ){
                ownerLotteryNumbers[i] = random.nextInt(10);
        }
        for(int i =0 ; i < gamersNumbers.length; i++ ){
            gamersNumbers[i] = random.nextInt(10);
        }

        for (int i = 0; i < ownerLotteryNumbers.length; i++) {
            int pos = i;
            int min = ownerLotteryNumbers[i];
            for (int j = i + 1; j < ownerLotteryNumbers.length ; j++) {
                if(ownerLotteryNumbers[j] < min){
                    pos = j;
                    min = ownerLotteryNumbers[j];
                }
            }
            ownerLotteryNumbers[pos] = ownerLotteryNumbers[i];
            ownerLotteryNumbers[i] = min;
        }
        Arrays.sort(gamersNumbers);


        int countMatches = 0;
        var elements = new ArrayList<Integer>();

        for (int i = 0; i < ownerLotteryNumbers.length; i++) {
            if(ownerLotteryNumbers[i] == gamersNumbers[i]){
                countMatches++;
                elements.add(i);
            }
        }
        if(elements.isEmpty()) {
            System.out.println("К сожалению, совпадений нет");
        } else {
            System.out.println("совпали такие элементы: " + elements);
        }
        System.out.println("количество совпадений: " + countMatches);
    }
}
