package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by apple on 15/01/17.
 */
public class HE {

    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {


            String ss[]=br.readLine().split(" ");
            int size=Integer.parseInt(ss[0]);
            int k=Integer.parseInt(ss[1]);
            String arr[]=br.readLine().split(" ");
            int intArr[]=new int[arr.length];

            for(int j=0;j<arr.length;j++){
                intArr[j]=Integer.parseInt(arr[j]);

            }


            int x=size-(k-1);

            long max=Integer.MIN_VALUE;
                for (int j = 0; j <= size - x; j++) {




                        long value=Math.max((long)intArr[j] * (long)intArr[j + (x - 1) - 1], (long)intArr[j + 1] * (long)intArr[j + (x - 1)]);
                        if(max<value){

                            max=value;
                        }




                }


                /*
                System.out.println(" a " + ans.length);

                for (int k = 0; k < arr1[0]; k++) {


                    // System.out.println("K "+k);

                    for (int l = 0; l < arr1[0]; l++) {

                        System.out.print(ans[k][l] + " ");

                    }
                    System.out.println();

                }

                */
                // System.out.println();
                // System.out.println();



            if(max==Integer.MIN_VALUE){

                System.out.println((long)intArr[0]*(long)intArr[intArr.length-1]);

            }else {

                System.out.println(max);
            }



        }








    }



}
