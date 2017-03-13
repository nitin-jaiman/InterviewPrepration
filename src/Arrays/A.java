package Arrays;

import java.util.ArrayList;

/**
 * Created by apple on 03/03/17.
 */
public class A {


    ArrayList<Integer> fib=new ArrayList<>();

    private void calculate(int n){

        fib.add(0,1);
        fib.add(1,1);

        for(int i=2;i<n;i++){

            fib.add(i,fib.get(i-1)+fib.get(i-2));

        }

    }

    public void driverMethod(int n){

        if(fib.size()<n){

            calculate(n);

            System.out.println(fib.get(n-1));

        }else{

            System.out.println(fib.get(n-1));

        }


    }

    public static void main(String args[]){


        A a=new A();
        a.calculate(10);
        System.out.println(a.fib);
        a.driverMethod(25);
        System.out.println(a.fib);

    }



}



