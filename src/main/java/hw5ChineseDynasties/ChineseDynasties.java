package main.java.hw5ChineseDynasties;

public class ChineseDynasties {
    public static void main(String[] args) {
        int liWarriorPower, liSagittariusPower, liRiderPower, liWarriorAmount, liSagittariusAmount, liRiderAmount;
        int minWarriorPower, minSagittariusPower, minRiderPower, minWarriorAmount, minSagittariusAmount, minRiderAmount;
        int liTotalPower, minTotalPower;

        liWarriorPower = 13;
        liSagittariusPower = 24;
        liRiderPower = 46;
        liWarriorAmount = 860;
        liSagittariusAmount = 860;
        liRiderAmount = 860;

        minWarriorPower = 9;
        minSagittariusPower = 35;
        minRiderPower = 12;
        minWarriorAmount = (int)(860 * 1.5);
        minSagittariusAmount = (int)(860 * 1.5);
        minRiderAmount = (int)(860 * 1.5);

        liTotalPower = ((liWarriorPower * liWarriorAmount) + (liSagittariusPower * liSagittariusAmount) + (liRiderAmount * liRiderPower));
        minTotalPower = ((minWarriorPower * minWarriorAmount) + (minSagittariusPower * minSagittariusAmount) + (minRiderPower * minRiderAmount));
        System.out.println("Total Li power is " + liTotalPower);
        System.out.println("Total Min power is " + minTotalPower);
    }
}
