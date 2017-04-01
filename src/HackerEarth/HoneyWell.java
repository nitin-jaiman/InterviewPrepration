package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by apple on 25/03/17.
 */
public class HoneyWell {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String args[]) throws IOException {

        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n+1];
        String s[]=br.readLine().split(" ");
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<s.length;i++){

            arr[i+1]=Integer.parseInt(s[i]);

        }

        while(q!=0){

            String range[]=br.readLine().split(" ");
            int l=Integer.parseInt(range[0]);
            int r=Integer.parseInt(range[1]);

            for(int j=l;j<=r;j++)
            {

                swap(j,arr);

            }
            q--;
        }


        for (int i=1;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }




    }

    public static void swap(int i,int arr[]){

        int temp=arr[i];
        arr[i]=arr[arr.length-i];
        arr[arr.length-i]=temp;
    }

}
