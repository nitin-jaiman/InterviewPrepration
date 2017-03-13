package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class MinCoins {


    public int getMinCoins(int total,int[] coins){

        int r[][]=new int[coins.length+1][total+1];


        for(int i=0;i<coins.length+1;i++){

            r[i][0]=0;
        }
        for(int i=0;i<total+1;i++){

            r[0][i]=i;
        }

        for(int i=1;i<coins.length+1;i++){

            for(int j=1;j<=total;j++){

               // System.out.println("i "+i+" j "+j);

                if(coins[i-1]>j) {
                    r[i][j]=r[i-1][j];
                }else{

                    int x=Math.min(r[i-1][j],1+r[i][j-coins[i-1]]);
                    r[i][j]=x;
                }

            }


        }

        print2DArray(r);
        return r[coins.length][total];

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

        MinCoins minCoins=new MinCoins();
        System.out.println(minCoins.getMinCoins(11,new int[]{1,5,6,8}));


    }

}
