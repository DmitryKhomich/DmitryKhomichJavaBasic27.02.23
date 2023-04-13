package hw16Interface;

public interface LinuxOS {
    default void os(){
        System.out.println("Я использую Linux");
    }
}
