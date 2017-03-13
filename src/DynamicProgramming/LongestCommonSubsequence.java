package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */

/*
If last characters of both sequences match (or X[m-1] == Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = 1 + L(X[0..m-2], Y[0..n-2])

If last characters of both sequences do not match (or X[m-1] != Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = MAX ( L(X[0..m-2], Y[0..n-1]), L(X[0..m-1], Y[0..n-2])
 */
public class LongestCommonSubsequence {

    public int getLCS(char arr1[],char arr2[]){


        int r[][]=new int[arr1.length+1][arr2.length+1];


        for(int i=0;i<arr1.length;i++){

            r[i][0]=0;

        }
        for(int i=0;i<arr2.length;i++){

            r[0][i]=0;

        }

        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){

                if(arr1[i]==arr2[j]){

                    r[i+1][j+1]=1+r[i][j];

                }else{

                    r[i+1][j+1]=Math.max(r[i+1][j],r[i][j+1]);
                }



            }
        }

        print2DArray(r);

        return r[arr1.length][arr2.length];





    }


    public void print2DArray(int[][] r){

        for(int i=0;i<r.length;i++){

            for(int j=0;j<r[0].length;j++){

                System.out.print(r[i][j]+" ");

            }
            System.out.println();

        }

    }


    public static void main(String args[]){


        char []arr1="abcdaf".toCharArray();
        char []arr2="acbcf".toCharArray();


        LongestCommonSubsequence l=new LongestCommonSubsequence();

        System.out.println(l.getLCS(arr2,arr1));

    }


}
