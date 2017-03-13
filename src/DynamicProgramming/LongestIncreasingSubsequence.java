package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by apple on 13/03/17.
 */
public class LongestIncreasingSubsequence {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int D = Integer.parseInt(line[1]);
        String l[]=br.readLine().split(" ");
        int data[]=new int[N];
        int result[]=new int[N];


        for (int i = 0; i < N; i++) {

            data[i]=Integer.parseInt(l[i]);
            result[i]=1;

        }

        for(int i=1;i<N;i++){

            for(int j=0;j<i;j++){

                if(data[i]-data[j]>=2){

                    result[i]=Math.max(result[i],result[j]+1);

                }

            }

        }

        int max=Integer.MIN_VALUE;

        for(int i=1;i<N;i++){

            if(result[i]>max){
                max=result[i];
            }
        }





        System.out.println(max);
    }

}
