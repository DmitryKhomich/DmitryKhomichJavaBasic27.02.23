package hw16Interface;

public class Iphones implements Smartphones, IOS{
    @Override
    public void call() {
        System.out.println("Вызов абонента");
    }

    @Override
    public void sms() {
        System.out.println("Отправка смс");
    }

    @Override
    public void internet() {
        System.out.println("Выход в интернет");
    }
}
