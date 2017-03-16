package SearchingSorting;

/**
 * Created by apple on 15/03/17.
 */
public class BinarySearchModified {


    public int getNumberOf1s(int v[]){

        int l=0;
        int r=v.length-1;

        while(r>l){

            int m=(l+r)/2;

            if(v[m]==1&&v[m+1]==0){return m;}
            else if(v[m]==0&&v[m+1]==0){  r=m-1; }
            else if(v[m]==1&&v[m+1]==1){l=m+1;}

        }



        return v.length-1;

    }

    public static void main(String args[]){

        BinarySearchModified binarySearchModified=new BinarySearchModified();
        System.out.println(binarySearchModified.getNumberOf1s(new int[]{1,1,1,1,1,1,1})+1);

    }



}
