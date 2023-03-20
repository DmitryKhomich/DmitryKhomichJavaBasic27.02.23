package hw8Shuttles;

import java.util.*;

public class Shuttles {
    public static void main(String[] args) {

        var shuttleSet = new ArrayList<Integer>();
        Integer count = 0;
        while(shuttleSet.size() < 100){

            if(count.toString().contains("4") || count.toString().contains("9") || count.toString().equals("0")){
                count++;
                continue;
            }
            shuttleSet.add(count);
            count ++;
        }
        for(Integer print : shuttleSet){
            System.out.println(print);
        }
    }
}
