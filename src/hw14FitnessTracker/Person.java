package hw14FitnessTracker;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final long phone;

    private String lastName;
    private int weight;
    private int pressure;
    private int stepsCount;

    private static int age;

    public Person(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, long phone, String lastName, int weight, int pressure, int stepsCount) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsCount = stepsCount;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", stepsCount=" + stepsCount ;

    }
    public static int countAge(Person person){
        LocalDate localDate = LocalDate.now();
        age = localDate.getYear() - person.getYearOfBirth();
        return age;
    }

}
