package hw16Interface;

public interface IOS {
    default void os(){
        System.out.println("Я использую iOS");
    }
}
