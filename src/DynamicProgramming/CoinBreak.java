package DynamicProgramming;

/**
 * Created by apple on 15/03/17.
 */
public class CoinBreak {

    public int getMaxCoins(int n){


        if(n==1){return 1;}
        if(n==2){return 2;}
        if(n==3){return 3;}


        int a=getMaxCoins((int)n/2);
        int b=getMaxCoins((int)n/3);
        int c=getMaxCoins((int)n/4);

        if(a+b+c>n){


            return a+b+c;
        }else{

            return n;
        }


    }



    public static void main(String args[]){


        CoinBreak coinBreak=new CoinBreak();
        System.out.println(coinBreak.getMaxCoins(12));

    }


}
