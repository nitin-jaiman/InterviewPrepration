package Sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by apple on 05/03/17.
 */
public class MergeSort {



    public ArrayList<Integer> getSortedList(ArrayList<Integer> list){



        if(list.size()==1){


            return list;
        }

        ArrayList<Integer> left= new ArrayList<Integer>(list.subList(0,(list.size()/2)));
        ArrayList<Integer> right= new ArrayList<Integer> (list.subList((list.size()/2),list.size()));

        ArrayList<Integer> sortedList=new ArrayList<>();

        ArrayList<Integer> alleft=getSortedList(left);
        ArrayList<Integer> alright=getSortedList(right);


        int i=0,j=0,k=0;

        while(i<alleft.size()&&j<alright.size()){

            if(alleft.get(i)<alright.get(j)){

                sortedList.add(k,alleft.get(i));
                i++;
                k++;

            }
            else{

                sortedList.add(k,alright.get(j));
                j++;
                k++;


            }


        }

        if(j>=alright.size()){

            while(i<alleft.size()){

                sortedList.add(k,alleft.get(i));
                i++;
                k++;
            }

        }else if(i>=alleft.size()){
            while(j<alright.size()) {
                sortedList.add(k, alright.get(j));
                j++;
                k++;
            }
        }

        return sortedList;



    }


    public static void main(String args[]){


        ArrayList<Integer> al=new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.add(11);

        System.out.println(al);

        MergeSort mergeSort=new MergeSort();
        System.out.println(mergeSort.getSortedList(al));

    }





}
