package Math;

import java.math.BigInteger;

/**
 * Created by apple on 18/03/17.
 */
public class AllSubset {


    public void generateSubset(char[] c,int n){

        for(int i=0;i<Math.pow(2,n);i++){


           String binary = Integer.toBinaryString(i);
            System.out.println(binary);
            if(binary.length()>0) {
                System.out.println(getSet(binary.toCharArray(), c));
            }

        }



    }

    public String getSet(char c[],char []s){

        String v="";

        for(int i=0;i<c.length;i++){

            if(c[i]=='1'){

                v=v+s[c.length-1-i];
            }

        }


        return new StringBuffer(v).reverse().toString();
    }


    public static void main(String args[]){

       AllSubset allSubset=new AllSubset();
        allSubset.generateSubset(new char[]{'a','b','c','d'},4);

    }


}
