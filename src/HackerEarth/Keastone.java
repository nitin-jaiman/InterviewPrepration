package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by apple on 31/03/17.
 */
public class Keastone {
/*
    public static void main(String args[]) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        while(N!=0){

            int n=Integer.parseInt(br.readLine());

            boolean r[]=new boolean[n+1];
            r[1]=false;
            for(int i=2;i<=n;i++){

                if(isPowerOfTwo(i)){

                    r[i]=!r[i-(i/2)];

                }else{

                   int nn= (int) Math.floor(Math.log(i)/ Math.log(2));

                   // System.out.println("i "+i+" "+nn+"   "+(i-(int)Math.pow(2,nn)));
                    r[i]=!r[(i-(int)Math.pow(2,nn))];
                }

            }

            if(r[n]){
                System.out.println("Bruce");

            }else{
                System.out.println("Clark");
            }

            N--;
        }


    }



    public static boolean istrue(BigInteger i){

        if(i.equals(new BigInteger("1"))){

            return false;
        }
        if(i.equals(new BigInteger("2"))){return true;}

        if(){

            return !istrue(i/2L);
        }else{

            long nn= (long) Math.floor(Math.log(i)/ Math.log(2));

            return !istrue((i-(long)Math.pow(2,nn)));
        }

    }


*/


}
