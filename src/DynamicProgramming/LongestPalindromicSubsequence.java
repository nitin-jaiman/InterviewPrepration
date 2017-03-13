package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class LongestPalindromicSubsequence {


    public int getLongestPalindromicSubsequence(char[] arr){


        int r[][]=new int[arr.length][arr.length];

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-i;j++){


                if(i==0){

                    r[j][i+j]=1;

                }else{

                    if(arr[j]==arr[j+i]) {
                        r[j][i + j] =2+r[j+1][j+i-1];
                    }else{

                        r[j][i+j]=Math.max(r[j][i+j-1],r[j+1][i+j]);
                    }
                }

            }


        }




        print2DArray(r);
        return r[0][arr.length-1];

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

        LongestPalindromicSubsequence l=new LongestPalindromicSubsequence();
        System.out.println(l.getLongestPalindromicSubsequence(new char[]{'a','g','b','d','b','a'}));


    }

}
