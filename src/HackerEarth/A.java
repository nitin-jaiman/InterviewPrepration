package HackerEarth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by apple on 15/02/17.
 */
public class A {

public static void main(String args[]){

    int x[]=new int[5];

    int i;

    for(i=0;i<x.length;i++){
        x[i]=i;
        System.out.println(x[i]);
    }

    xx();



}

public static void xx(){


    List strList=new ArrayList();
    strList.add("1");
    strList.add("2");
    strList.add("3");

    Iterator i=strList.iterator();
    while(i.hasNext()){
        strList.add("4");
    }




    System.out.println(System.currentTimeMillis());

}

}
