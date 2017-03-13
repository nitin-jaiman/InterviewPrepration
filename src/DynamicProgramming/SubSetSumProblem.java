package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class SubSetSumProblem {

    public boolean isPossible(int sum,int []v){


        boolean r[][]=new boolean[v.length+1][sum+1];


        for(int i=0;i<=sum;i++){r[0][i]=false;}
        for(int i=0;i<=v.length;i++){r[i][0]=true;}


        for(int i=1;i<=v.length;i++)
        {
            for(int j=1;j<=sum;j++){
                if(v[i-1]>j){r[i][j]=r[i-1][j];}
                else{
                    if(r[i-1][j]){r[i][j]=true;}
                    else{
                        r[i][j]=r[i-1][j-v[i-1]];
                    }


                }


            }


        }

        print2DArray(r);
        return r[v.length][sum];
    }
    public void print2DArray(boolean[][] r){

        for(int i=0;i<r.length;i++){

            for(int j=0;j<r[0].length;j++){

                System.out.print(r[i][j]+" ");

            }
            System.out.println();

        }

    }


    public static void main(String args[]){

        SubSetSumProblem subSetSumProblem=new SubSetSumProblem();
        System.out.println(subSetSumProblem.isPossible(11,new int[]{2,3,7,8,10}));

    }

}
