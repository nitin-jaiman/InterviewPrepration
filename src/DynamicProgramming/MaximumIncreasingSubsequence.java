package DynamicProgramming;

/**
 * Created by apple on 14/03/17.
 */
public class MaximumIncreasingSubsequence {

    public int getMax(int v[]){

        int r[]=new int[v.length];

        for(int i=0;i<r.length;i++){


            r[i]=v[i];

        }

        int maximum=Integer.MIN_VALUE;

        for(int i=1;i<r.length;i++){

            int max=Integer.MIN_VALUE;

            for(int j=0;j<i;j++){

                if(v[j]<v[i]){

                    if(max<r[j]){
                        max=r[j];

                    }

                }

            }

            if(max!=Integer.MIN_VALUE){
                r[i]=max+v[i];
                if(maximum<r[i]){maximum=r[i];}

            }

        }


        return maximum;

    }

    public static void main(String args[]){

         MaximumIncreasingSubsequence m=new MaximumIncreasingSubsequence();

        System.out.println(m.getMax(new int[]{4,6,1,3,8,4,6}));

    }


}
