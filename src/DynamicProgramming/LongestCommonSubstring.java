package DynamicProgramming;

/**
 * Created by apple on 13/03/17.
 */
public class LongestCommonSubstring {

    public int getLCS(char[] a,char[] b){

        int r[][]=new int[a.length+1][b.length+1];

        for(int i=0;i<a.length;i++){r[i][0]=0;}
        for(int i=0;i<b.length;i++){r[0][i]=0;}

        int max=0;

        for(int i=1;i<a.length+1;i++){

            for(int j=1;j<b.length+1;j++){

                if(a[i-1]==b[j-1]){

                    r[i][j]=1+r[i-1][j-1];
                    if(max<r[i][j]){

                        max=r[i][j];
                    }

                }else{

                    r[i][j]=0;
                }

            }


        }

     return max;

    }


    public static void main(String args[]){

        LongestCommonSubstring l=new LongestCommonSubstring();
        System.out.println( l.getLCS(new char[]{'z','b','c','d','f'},new char[]{'a','b','c','d','a','f'}));

    }

}
