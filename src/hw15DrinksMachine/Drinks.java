package hw15DrinksMachine;

import java.util.Scanner;

import static hw15DrinksMachine.DrinksMachine.*;

public class Drinks {
    public static final int PRICE_OF_TEA = 35;
    public static final int PRICE_OF_COFFEE = 75;
    public static final int PRICE_OF_LEMONADE = 69;
    public static final int PRICE_OF_MINERAL_WATTER = 13;
    public static final int PRICE_OF_MOJITO = 110;
    public static final int PRICE_OF_COKE = 28;
    public static Scanner scanner = new Scanner(System.in);

    protected static void makeTea() {
        System.out.println("Я готовлю чай");
    }

    protected static void makeCoffee() {
        System.out.println("Я готовлю кофе");
    }

    protected static void makeLemonade() {
        System.out.println("Я готовлю лимонад");
    }

    protected static void makeMojito() {
        System.out.println("Я готовлю мохито");
    }

    protected static void makeMineralWater() {
        System.out.println("Я наливаю минеральную воду");
    }

    protected static void makeCoke() {
        System.out.println("Я наливаю кока-колу");
    }

    public static void chooseDrink(String type) {
        DrinksMachine drinkType = DrinksMachine.valueOf(type.toUpperCase());
        switch (drinkType) {
            case TEA:
                makeTea();
                System.out.println("Вот Ваш чай");
                break;
            case COFFEE:
                makeCoffee();
                System.out.println("Вот Ваш кофе");
                break;
            case MOJITO:
                makeMojito();
                System.out.println("Вот Ваш мохито");
                break;
            case COKE:
                makeCoke();
                System.out.println("Вот Ваша кока-кола");
                break;
            case MINERAL_WATTER:
                makeMineralWater();
                System.out.println("Вот Ваша минеральная вода");
                break;
            case LEMONADE:
                makeLemonade();
                System.out.println("Вот Ваш лимонад");
                break;
            default:
                System.out.println("К сожалению, у нас нет в ассортименте данного напитка");
                break;
        }
    }
    public static int totalSum(String type){
        int total = 0;
        DrinksMachine drinkType = DrinksMachine.valueOf(type.toUpperCase());
        switch (drinkType) {
            case TEA:
                total += PRICE_OF_TEA;
                break;
            case COFFEE:
                total += PRICE_OF_COFFEE;
                break;
            case MOJITO:
                total += PRICE_OF_MOJITO;
                break;
            case COKE:
                total += PRICE_OF_COKE;
                break;
            case MINERAL_WATTER:
                total += PRICE_OF_MINERAL_WATTER;
                break;
            case LEMONADE:
                total += PRICE_OF_LEMONADE;
                break;
            default:
                total += 0;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Приветствую тебя в нашем баре 'Две чарки'!");
        System.out.println("Ты можешь заказать такие напитки: " + TEA + ", " + COFFEE + ", " + MINERAL_WATTER + ", " + MOJITO + ", " + COKE + ", " + LEMONADE);
        System.out.println("Для заказа введи название напитка на английском языке или напиши слово stop - чтобы остановится и попросить счет");
        int count = 0;
        int totalPrice = 0;
        try {
            while (scanner.hasNextLine()) {
                String drink = scanner.nextLine();
                if (drink.equalsIgnoreCase("STOP")) {
                    break;
                } else {
                    chooseDrink(drink);
                    count++;
                    totalPrice += totalSum(drink);
                }
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Это не название напитка, либо у нас его нет в ассортименте");
        }
        finally {
            System.out.println("Итак, ты заказал всего напитков " + count + " твой счет составил: " + totalPrice + " грн" + " и не забудь накинуть мне на чай");
        }
    }
}

