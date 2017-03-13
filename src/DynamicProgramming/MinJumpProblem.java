package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class MinJumpProblem {

    public int getMinJump(int []v){

        int r[]=new int[v.length];

        for(int i=1;i<r.length;i++){

            int min=Integer.MAX_VALUE;

            for(int j=0;j<i;j++){

                if(v[j]+j>=i){

                    if(min>r[j]){min=r[j];}
                    r[i]=min+1;

                }

            }

        }


        return r[v.length-1];
    }


    public static void main(String args[]){


        MinJumpProblem m=new MinJumpProblem();
        System.out.println(m.getMinJump(new int[]{2,3,1,1,2,4,2,0,1,1}));

    }


}
