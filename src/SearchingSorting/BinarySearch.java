package SearchingSorting;

/**
 * Created by apple on 14/03/17.
 */
public class BinarySearch {



    public int getElementRec(int v[],int l, int r,int x){

        if(l>r){return -1;}


        int m=(l+r)/2;

        if(v[m]>x){

            return getElementRec(v,l,m-1,x);

        }else if(v[m]<x){

           return getElementRec(v,m+1,r,x);

        }else{

            return m;

        }


    }



    public int getElementItr(int v[],int l, int r,int x) {

        int index=-1;

        while(l<=r){

            int m=(l+r)/2;
            if(v[m]>x){

                r=m-1;

            }else if(v[m]<x){

                l=m+1;

            }
            else{

                index=m;
                break;

            }


        }

        return index;
    }


    public static void main(String args[]){

        BinarySearch b=new BinarySearch();
        System.out.println( b.getElementItr(new int[]{1,2,7,14,55,56,70},0,6,70));


    }





}
