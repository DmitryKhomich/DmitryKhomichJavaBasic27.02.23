import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNumberInt = 0;
        int secondNumberInt = 0;
        double firstNumberDouble = 0;
        double secondNumberDouble = 0;
        String operation;
        boolean firstIsInt;
        boolean secondIsInt;

        System.out.println("Добро пожаловать в калькулятор!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите первое число:");
        if (firstIsInt = scanner.hasNextInt()) {
            firstNumberInt = scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            firstNumberDouble = scanner.nextDouble();
        } else {

            throw new RuntimeException("Ошибка. Вы ввели не число");
        }

        System.out.println("Введите второе число: ");
        if (secondIsInt = scanner.hasNextInt()) {
            secondNumberInt = scanner.nextInt();
        } else if (scanner.hasNextDouble()){
            secondNumberDouble = scanner.nextDouble();
        }
        else {
            throw new RuntimeException("Ошибка. Вы ввели не число");
        }

        System.out.println("Введите операцию, которую хотите произвести: ");
        if (scanner.hasNextLine()) {
            operation = scanner.next();

            switch (operation) {
                case "+":
                    if(firstIsInt && secondIsInt)
                        System.out.println("Результат: " + (firstNumberInt + secondNumberInt));
                    if(!firstIsInt && !secondIsInt)
                        System.out.println("Результат: " + (firstNumberDouble + secondNumberDouble));
                    if(firstIsInt && !secondIsInt)
                        System.out.println("Результат: " + (firstNumberInt + secondNumberDouble));
                    if(!firstIsInt && secondIsInt)
                        System.out.println("Результат: " + (firstNumberDouble + secondNumberInt));
                    break;
                case "-":
                    if(firstIsInt && secondIsInt)
                        System.out.println("Результат: " + (firstNumberInt - secondNumberInt));
                    if(!firstIsInt && !secondIsInt)
                        System.out.println("Результат: " + (firstNumberDouble - secondNumberDouble));
                    if(firstIsInt && !secondIsInt)
                        System.out.println("Результат: " + (firstNumberInt - secondNumberDouble));
                    if(!firstIsInt && secondIsInt)
                        System.out.println("Результат: " + (firstNumberDouble - secondNumberInt));
                    break;
                case "*":
                    if(firstIsInt && secondIsInt)
                        System.out.println("Результат: " + (firstNumberInt * secondNumberInt));
                    if(!firstIsInt && !secondIsInt)
                        System.out.println("Результат: " + (firstNumberDouble * secondNumberDouble));
                    if(firstIsInt && !secondIsInt)
                        System.out.println("Результат: " + (firstNumberInt * secondNumberDouble));
                    if(!firstIsInt && secondIsInt)
                        System.out.println("Результат: " + (firstNumberDouble * secondNumberInt));
                    break;
                case "/":
                    if (secondNumberInt == 0 && secondNumberDouble == 0){
                        throw new RuntimeException("Деление на 0 запрещено");
                    }
                    if(firstIsInt && secondIsInt ) {
                        if (firstNumberInt % secondNumberInt == 0)
                            System.out.println("Результат: " + (firstNumberInt / secondNumberInt));
                        else {
                            double res = firstNumberInt / secondNumberInt;
                            System.out.println(res);
                        }
                    }
                    if(!firstIsInt && !secondIsInt ) {
                        if((firstNumberDouble % secondNumberDouble != 0))
                        System.out.println("Результат: " + (firstNumberDouble / secondNumberDouble));
                        else{
                            int res = (int) (firstNumberDouble / secondNumberDouble);
                            System.out.println(res);
                        }
                    }
                    if(firstIsInt && !secondIsInt ) {
                        if ((firstNumberInt % secondNumberDouble != 0))
                            System.out.println("Результат: " + (firstNumberInt / secondNumberDouble));
                        else {
                            int res = (int) (firstNumberInt / secondNumberDouble);
                            System.out.println(res);
                        }
                    }
                        if (!firstIsInt && secondIsInt ) {
                            if((firstNumberDouble % secondNumberDouble != 0))
                            System.out.println("Результат: " + (firstNumberDouble / secondNumberInt));
                        else{
                                int res = (int) (firstNumberDouble / secondNumberInt);
                                System.out.println(res);
                            }
                        }

                    break;
                default:
                    throw new RuntimeException("К сожалению, вы ввели неправильную операцию над числами, доступные операции: +, -, *, /");
            }
        }
    }
}
