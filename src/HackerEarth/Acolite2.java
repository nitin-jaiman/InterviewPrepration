package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by apple on 19/02/17.
 */
public class Acolite2 {

    public static void main(String args[]) throws IOException {


        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;i++){

            String size=bufferedReader.readLine();
            String s=bufferedReader.readLine();

            int arr[]=new int[s.length()];
            int count=0;
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int j=0;j<s.length();j++){

                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u') {

                    if(j==0){
                        arr[j]=1;

                    }else{
                        arr[j]=arr[j-1]+1;

                    }

                }else{
                    if(j==0){
                        arr[j]=0;

                    }else{
                        arr[j]=arr[j-1];

                    }

                }


            }


            for(int k=0;k<arr.length;k++){

                if(hm.containsKey(arr[k])){

                    hm.put(arr[k],hm.get(arr[k])+1);

                }else{

                    hm.put(arr[k],1);
                }

               // System.out.print(arr[k]+" ");

            }

           Set<Map.Entry<Integer,Integer>>  eset=hm.entrySet();

            int sum=0;

            if(hm.containsKey(3)) {


                sum=hm.get(3);

                //System.out.println(hm);
                for (Map.Entry<Integer, Integer> entry : eset) {

                    int key = entry.getKey();


                    //  System.out.println(key);
                    if (key > 3) {


                            sum = sum + (hm.get(key) * hm.get(key - 2));


                    }

                }
                System.out.println(sum);
            }else{

                System.out.println(0);
            }



        }



    }






}
