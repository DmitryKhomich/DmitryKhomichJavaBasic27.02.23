package hw8Shuttles;

import java.util.*;

public class Shuttles {
    public static void main(String[] args) {

        var shuttleList = new ArrayList<Integer>();
        Integer count = 0;
        while(shuttleList.size() < 100){

            if(count.toString().contains("4") || count.toString().contains("9") || count.toString().equals("0")){
                count++;
                continue;
            }
            shuttleList.add(count);
            count ++;
        }
        for(Integer print : shuttleList){
            System.out.println(print);
        }
    }
}
