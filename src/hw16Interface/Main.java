package hw16Interface;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        Iphones iPhone = new Iphones();
        android.call();
        android.internet();
        android.sms();
        android.os();
        System.out.println();
        iPhone.call();
        iPhone.internet();
        iPhone.sms();
        iPhone.os();
    }
}
