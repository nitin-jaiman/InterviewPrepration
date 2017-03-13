package DynamicProgramming;

/**
 * Created by apple on 12/03/17.
 */
public class EggDroppingProblem {


    public int getMinimumAttempts(int f,int e){


        int arr[][]=new int[e+1][f+1];

        for(int i=0;i<=f;i++){

            arr[0][i]=0;
            arr[1][i]=i;

        }

        for(int i=0;i<=e;i++){

            arr[i][0]=0;

        }

        for(int n=2;n<=e;n++){

            for(int i=1;i<=f;i++){

                int min=Integer.MAX_VALUE;
                for(int j=1;j<=i;j++){

                    int attempts=1+Math.max(arr[n-1][j-1],arr[n][i-j]);

                    if(min>attempts){
                        min=attempts;
                    }

                }

                arr[n][i]=min;


            }


        }


        return arr[e][f];

    }


    public static void main(String args[]){


        EggDroppingProblem eggDroppingProblem=new EggDroppingProblem();
        System.out.println( eggDroppingProblem.getMinimumAttempts(100,1));


    }



}
