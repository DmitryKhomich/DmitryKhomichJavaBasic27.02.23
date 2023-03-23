package hw12PersonInfo;

public class Person {

    public static String personInfo(String name, String lastName, String city, long phoneNumber){
        return ("Позвоните гражданину " + name + " " + lastName + " " + "с города " + city + " можно по номеру " + phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println(personInfo("Will","Smith","New York",2936729462846L));
        System.out.println(personInfo("Jackie","Chan","Shanghai",12312412412L));
        System.out.println(personInfo("Sherlock","Holmes","London",37742123513L));
    }
}
