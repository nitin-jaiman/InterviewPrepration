package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class EditDistance {

    public int getEditDistance(char[] a1,char []a2){

        int r[][]=new int[a1.length+1][a2.length+1];


        for(int i=0;i<=a1.length;i++){r[i][0]=i;}
        for(int i=0;i<=a2.length;i++){r[0][i]=i;}

        for(int i=0;i<a1.length;i++){

            for(int j=0;j<a2.length;j++){

                if(a2[j]==a1[i]){

                    r[i+1][j+1]=r[i][j];

                }else{

                    r[i+1][j+1]=Math.min(Math.min(1+r[i][j],1+r[i][j+1]),1+r[i+1][j]);

                }


            }
        }

        print2DArray(r);

        return r[a1.length][a2.length];
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


        char []arr1="abcdef".toCharArray();
        char []arr2="azced".toCharArray();

        EditDistance editDistance=new EditDistance();
        System.out.println(editDistance.getEditDistance(arr2,arr1));

    }


}
