package hw12PersonInfo;

public class Person {

    public static String personInfo(String name, String lastName, String city, String phoneNumber){
        return ("Позвоните гражданину " + name + " " + lastName + " " + "с города " + city + " можно по номеру " + phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println(personInfo("Will","Smith","New York","2936729462846"));
        System.out.println(personInfo("Jackie","Chan","Shanghai","12312412412"));
        System.out.println(personInfo("Sherlock","Holmes","London","37742123513"));
    }
}
