package DynamicProgramming;

/**
 * Created by apple on 18/03/17.
 */
public class IslandAndRobot {

    public double getProbability(int m,int n,int kk,int x,int y){


        double r[][][]=new double[m+2][n+2][kk+1];


        for(int j=0;j<=m;j++){r[j][0][0]=1d; r[j][n+1][0]=1d;}
        for(int j=0;j<=n;j++){r[0][j][0]=1d; r[0][m+1][0]=1d;}


        for(int j=1;j<=m;j++){

            for(int k=1;k<=n;k++)
            {

                if(j==1&&k==1) {
                    r[j][k][1] =0.5;
                }
               else if(j==1&&k==n) {
                    r[j][k][1] =0.5;
                }
               else if(j==m&&k==1) {
                    r[j][k][1] =0.5;
                }
               else if(j==m&&k==n) {
                    r[j][k][1] =0.5;
                }else if(j==1||j==m){
                    r[j][k][1]=0.25;

                }else if(k==1||k==n){

                    r[j][k][1]=0.25;
                }else{

                    r[j][k][1]=0;
                }
            }

        }


        for(int i=2;i<=kk;i++){

            for(int j=1;j<=m;j++){

                for(int k=1;k<=n;k++)
                {

                    double d=0;
                    d=d+(0.5)*(r[j+1][k][i-1]);
                    d=d+(0.5)*(r[j][k+1][i-1]);
                    d=d+(0.5)*(r[j-1][k][i-1]);
                    d=d+(0.5)*(r[j][k-1][i-1]);

                    r[j][k][i]=d+r[j][k][i-1];

                }

            }


        }


      //  print(r);

        return r[x][y][kk];


    }

    public void print(double v[][][]){

        for(int i=0;i<v.length;i++){

            for(int j=0;j<v[0].length;j++){

                for(int k=0;k<v[0][0].length;k++){

                    System.out.print(v[i][j][k]+" i "+i+" j "+""+j+" k "+k+"       ");

                }
                System.out.println();

            }
            System.out.println();


        }


    }


    public static void main(String args[]){


        IslandAndRobot islandAndRobot=new IslandAndRobot();
        System.out.println(islandAndRobot.getProbability(10,10,5,5,6));


    }


}
