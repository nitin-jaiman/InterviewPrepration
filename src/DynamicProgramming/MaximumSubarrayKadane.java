package DynamicProgramming;

/**
 * Created by apple on 14/03/17.
 */
public class MaximumSubarrayKadane {


    public int maxSubArray(int v[]){

        int r[]=new int[v.length+1];
        r[0]=0;

        int max=Integer.MIN_VALUE;


        for(int i=1;i<=v.length;i++){

            r[i]=Math.max(r[i-1]+v[i-1],v[i-1]);

            if(max<r[i]){

                max=r[i];
            }

        }



        return max;


    }


    public static void main(String args[]){


        MaximumSubarrayKadane m=new MaximumSubarrayKadane();
        System.out.println(m.maxSubArray(new int[]{1,-3,2,1,-1}));


    }


}
