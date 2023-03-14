package hw8Shuttles;

public class Shuttles {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if(Integer.toString(i).contains("4") || Integer.toString(i).contains("9")){
               continue;
            }
            System.out.println(i);
        }
    }
}
