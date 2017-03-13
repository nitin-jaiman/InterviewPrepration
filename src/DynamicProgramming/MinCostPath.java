package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class MinCostPath {



    public int getMinCostPath(int arr[][],int m,int n){


        int r[][]=new int[m+1][n+1];


        for(int i=0;i<=m;i++){r[i][0]=Integer.MAX_VALUE;}
        for(int i=0;i<=n;i++){r[0][i]=Integer.MAX_VALUE;}

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){


                int x=Math.min(Math.min(r[i][j+1],r[i+1][j]),r[i][j]);
                if(x==Integer.MAX_VALUE){x=0;}
                r[i+1][j+1]=x+arr[i][j];

            }


        }

        print2DArray(r);
        return r[m][n];
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

        int arr[][]=new int[][]{{1,2,3},{3,8,3},{1,1,3}};
        MinCostPath minCostPath=new MinCostPath();
        System.out.println(minCostPath.getMinCostPath(arr,3,3));


    }




}
