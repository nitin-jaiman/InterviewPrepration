package SearchingSorting;

/**
 * Created by apple on 15/03/17.
 */

/**
 * time complexity sqrt(n)
 */
public class JumpSearch {

    public int getJumpSearch(int []v,int x){


        int m= (int) Math.sqrt(v.length);

        int xI=0;

        for(int i=0;i<v.length;i=i+m){


            if(v[i]==x){return i;}
            else if(v[i]>x){xI=i; break;}

        }


        while(xI>0){

            if(v[xI]==x){return xI;}


            xI--;


        }


        return -1;

    }



    public static void main(String args[]){

        TernarySearch t=new TernarySearch();
        System.out.println( t.getItemIndex(new int[]{1,2,7,14,55,56,70},0,6,1));


    }


}
