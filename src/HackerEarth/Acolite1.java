package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by apple on 19/02/17.
 */
public class Acolite1 {


    public static void main(String []args) throws IOException {


        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());


        int arr[]=new int[n];
        String s[]=bufferedReader.readLine().split(" ");

        for(int i=0;i<s.length;i++){

            arr[i]=findMax(s[i]);

        }

        Arrays.sort(arr);

        BigInteger sum=new BigInteger("0");

        BigInteger mod=new BigInteger("1000000007");


        for(int i=0;i<s.length;i++){

           // System.out.println(arr[i]);

            BigInteger two=new BigInteger("2");
            BigInteger num=new BigInteger(arr[i]+"") ;
            BigInteger ibig=new BigInteger(i+"") ;
            sum=sum.add(num.multiply(two.modPow(ibig,mod))).mod(mod);


        }


        System.out.println(sum);




    }


    public static int findMax(String s){


        char c[]=s.toCharArray();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<c.length;i++){

            if(max<Integer.parseInt(String.valueOf(c[i]))){

                max=Integer.parseInt(String.valueOf(c[i]));

            }

        }

        return max;


    }


}
