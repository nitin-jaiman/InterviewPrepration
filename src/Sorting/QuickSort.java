package Sorting;

import java.util.ArrayList;

/**
 * Created by apple on 05/03/17.
 */
public class QuickSort {

    public void quickSort(ArrayList<Integer> list,int start,int end){


        if(start>=end){
            return;

        }

        int pIndex=getPivot(list,start,end);

        quickSort(list,start,pIndex-1);
        quickSort(list,pIndex+1,end);




    }

    public int getPivot(ArrayList<Integer> list,int start,int end){

          int pivot=list.get(end);
          int pIndex=start;

        for(int i=start;i<=end;i++){

            if(list.get(i)<pivot){

                int temp=list.get(pIndex);
                list.set(pIndex,list.get(i));
                list.set(i,temp);
                pIndex++;

            }


        }

        int temp = list.get(pIndex);
        list.set(pIndex,pivot);
        list.set(end,temp);


        return pIndex;



    }



    public static void main(String args[]){

        ArrayList<Integer> al=new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(4);
        al.add(5);
        al.add(-6);
        al.add(7);
        al.add(-8);
        al.add(-9);
        al.add(10);
        al.add(0);

        System.out.println(al);

        QuickSort quickSort=new QuickSort();
        quickSort.quickSort(al,0,al.size()-1);

        System.out.println(al);


    }

}
