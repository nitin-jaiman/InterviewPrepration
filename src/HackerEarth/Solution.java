package HackerEarth;

/**
 * Created by apple on 15/02/17.
 */
public class Solution {


    public static void main(String args[]){

        String s="354dfmnJ345";

        String ss[]=s.split("\\d+");

        int max=-1;

        for(int i=0;i<ss.length;i++){

            System.out.println(ss[i]);

            if(containsUP(ss[i])){

                if(ss[i].length()>max){

                    max=ss[i].length();
                }

            }


        }

        System.out.println(max);

    }


   static boolean containsUP(String s){

        char[] c=s.toCharArray();

        for(int i=0;i<c.length;i++){

            if(Character.isUpperCase(c[i])){


                return true;
            }

        }

        return false;
    }

}
