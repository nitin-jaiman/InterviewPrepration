package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by apple on 14/02/17.
 */
public class SimpleGame17 {


    public static void main(String args[]) throws IOException {


        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bf.readLine().split(" ");
        int arr1Size=Integer.parseInt(s[0]);
        int arr2Size=Integer.parseInt(s[1]);

        String arr1Str[]=bf.readLine().split(" ");
        String arr2Str[]=bf.readLine().split(" ");

        ArrayList<Long> al1=new ArrayList<>();
        ArrayList<Long> al2=new ArrayList<>();
        HashMap<Long,Integer> hm1=new HashMap();
        HashMap<Long,Integer> hm2=new HashMap();

        for(int i=0;i<arr1Size;i++){

            al1.add(Long.parseLong(arr1Str[i]));

            if(hm1.containsKey(Long.parseLong(arr1Str[i]))) {
                hm1.put(Long.parseLong(arr1Str[i]), hm1.get(Long.parseLong(arr1Str[i]))+1);
            }else{
                hm1.put(Long.parseLong(arr1Str[i]),1);
            }

        }
        for(int i=0;i<arr2Size;i++){

            al2.add(Long.parseLong(arr2Str[i]));

            if(hm2.containsKey(Long.parseLong(arr2Str[i]))) {
                hm2.put(Long.parseLong(arr2Str[i]), hm2.get(Long.parseLong(arr2Str[i]))+1);
            }else{
                hm2.put(Long.parseLong(arr2Str[i]),1);
            }


        }

        Collections.sort(al1);
        Collections.sort(al2);

        long sum1=0L;
        long sum2=0L;

        for(int i=0;i<arr1Size;i++){

            Long num=al1.get(i);
           int index = Collections.binarySearch(al2,num);
            if(index>0) {
                index = index + 1;

                sum1 = sum1 + ((index - 1-(hm2.get(num)-1)) * (arr2Size - index));
            }else if (index<0){

                index=-1*index-1;

                sum1=sum1+ (index)*(arr2Size-index);

            }
        }

        for(int i=0;i<arr2Size;i++){

            Long num=al2.get(i);
           int index = Collections.binarySearch(al1,num);

            if(index>0) {
                index = index + 1;

                sum2 = sum2 + ((index - 1-(hm1.get(num)-1)) * (arr1Size - index));
            }else if (index<0){

                index=-1*index-1;

                sum2=sum2+ (index)*(arr1Size-index);

            }
        }


        System.out.println(hm1);
        System.out.println(hm2);

        if(sum1>sum2){

            System.out.println("Monk "+ Math.abs(sum1-sum2));

        }else if(sum1<sum2){

            System.out.println("!Monk "+ Math.abs(sum1-sum2));


        }else{

            System.out.println("Tie");
        }



    }



}
