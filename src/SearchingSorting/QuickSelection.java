package SearchingSorting;

import Sorting.QuickSort;

/**
 * Created by apple on 16/03/17.
 */
public class QuickSelection {




    public int getKthElement(int v[],int l,int r,int k){


        if(l>r){return -1;}

        int pivot=r;
        int pIndex=l;

        for(int i=l;i<r;i++){

            if(v[i]<v[pivot]){

                int temp=v[i];
                v[i]=v[pIndex];
                v[pIndex]=temp;


                pIndex++;

            }


        }


       // System.out.println("l "+l+" r "+r);

        int temp=v[r];
        v[r]=v[pIndex];
        v[pIndex]=temp;


        if(pIndex==k){return v[pIndex];}
        else {

           int a= getKthElement(v, l, pIndex - 1, k);
            int b=getKthElement(v, pIndex + 1, r, k);

            return Math.max(a,b);

        }



    }


    public static void main(String args[]){

        QuickSelection q=new QuickSelection();
        System.out.println(q.getKthElement(new int[]{7, 10, 4, 3, 20, 15},0,5,3));





    }




}
