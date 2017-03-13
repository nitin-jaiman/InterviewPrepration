package HackerEarth;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by apple on 16/02/17.
 */
public class Car extends Vehicle {


    public void display(){

        System.out.println("its a car");

    }



    public static void main(String args[]){

        Vehicle v=new Vehicle();
        Vehicle v2= new Car();

        v.display();
        v2.display();
        ((Vehicle)v2).display();

        LinkedList<Long> l1=new LinkedList<>();

        Map<Integer,Integer> m=new HashMap<>();

    }

}
