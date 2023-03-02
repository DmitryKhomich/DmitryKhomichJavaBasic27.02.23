import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int firstNumberInt = 0;
        int secondNumberInt = 0;
        double firstNumberDouble = 0;
        double secondNumberDouble =0;
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
                    if(firstIsInt == true && secondIsInt == true)
                        System.out.println("Результат: " + (firstNumberInt + secondNumberInt));
                    if(firstIsInt == false && secondIsInt == false)
                        System.out.println("Результат: " + (firstNumberDouble + secondNumberDouble));
                    if(firstIsInt == true && secondIsInt == false)
                        System.out.println("Результат: " + (firstNumberInt + secondNumberDouble));
                    if(firstIsInt == false && secondIsInt == true)
                        System.out.println("Результат: " + (firstNumberDouble + secondNumberInt));
                    break;
                case "-":
                    System.out.println("Результат: " + (firstNumberInt - secondNumberInt));
                    break;
                case "*":
                    System.out.println("Результат: " + (firstNumberInt * secondNumberInt));
                    break;
                case "/":
                    if (secondNumberInt == 0){
                        throw new RuntimeException("Деление на 0 запрещено");
                    }
                    if(firstNumberInt % secondNumberInt == 0)
                    System.out.println("Результат: " + (firstNumberInt / secondNumberInt));
                    else {
                        double res = (double) firstNumberInt / secondNumberInt;
                        System.out.println(res);
                    }
                    break;
                default:
                    throw new RuntimeException("К сожалению, вы ввели неправильную операцию над числами, доступные операции: +, -, *, /");
            }
        }
    }
}
