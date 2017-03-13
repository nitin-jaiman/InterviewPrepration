package DynamicProgramming;

import java.util.HashMap;

/**
 * Created by apple on 12/03/17.
 */
public class CuttingRodProblem {

    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> dp=new HashMap<Integer,Integer>();
    {
        hm.put(1,2);
        hm.put(2,5);
        hm.put(3,7);
        hm.put(4,8);

    }


    /**
     * top down
     * @param n
     * @return
     */
    public int rec(int n){


        if(n==1){

            return 2;

        }


        int max=Integer.MIN_VALUE;

        for(int i=1;i<=n/2;i++){

            int x,y;

            if(dp.containsKey(n-i)){

                x=dp.get(n-i);

            }else {
                x = rec(n - i);
                dp.put(n-i,x);
            }

            if(dp.containsKey(i)){

                y=dp.get(i);

            }else {
                y = rec(i);
                dp.put(i,y);
            }
            if(hm.containsKey(n-i)&&(hm.get(n-i)>x)){

                x=hm.get(n-i);

            }
            if(hm.containsKey(i)&&(hm.get(i)>y)){

                y=hm.get(i);

            }

           if(max<(x+y)){

               max=x+y;
           }

        }

        return max;


    }



    public int bottomUp(int n){


        int dp[]=new int[n+1];
        dp[1]=2;

        for(int i=2;i<=n;i++){

            int max=Integer.MIN_VALUE;

            for(int j=1;j<=i/2;j++){

                if(max<(dp[j]+dp[i-j])){

                    max=dp[j]+dp[i-j];

                }

            }

            if(hm.containsKey(i)){

                if(max>hm.get(i)){

                    dp[i]=max;
                }else{
                    dp[i]=hm.get(i);

                }

            }else{

                dp[i]=max;
            }


        }

        return dp[n];

    }




    public static void main(String args[]){


        CuttingRodProblem cuttingRodProblem=new CuttingRodProblem();
        System.out.println(cuttingRodProblem.bottomUp(50000));



    }






}
