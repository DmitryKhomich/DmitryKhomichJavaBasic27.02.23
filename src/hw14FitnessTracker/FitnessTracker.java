package hw14FitnessTracker;

import java.time.LocalDate;

public class FitnessTracker {
    public static void main(String[] args) {
        Person marina = new Person("Marina",14,3,1980,"fdklgj@mail.com",22134113241L,"Tychyna",150,110,16);
        Person oleg = new Person("Oleg",11,7,1989,"f1234gj@mail.com",21341324111L,"Kosmonaft",88,90,123);
        Person yana = new Person("Yana",4,9,2000,"1lgj@mail.com",213413241241L,"Jordan",55,110,660);
        printAccountInfo(marina);
        printAccountInfo(oleg);
        printAccountInfo(yana);

        marina.stepsCount = 2000;
        marina.pressure = 60;
        marina.weight = 90;
        oleg.weight = 110;
        oleg.pressure = 40;
        oleg.lastName = "Shevchenko";
        System.out.println();
        printAccountInfo(marina);
        printAccountInfo(oleg);

    }
    public static void printAccountInfo(Person person){
        System.out.println(person);
        System.out.println(person.getName() + "'s age is " + Person.countAge(person));
    }
}
