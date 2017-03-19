package DivideAndConquer;

/**
 * Created by apple on 18/03/17.
 */

import javax.print.attribute.standard.Media;

/**
 * median of two sorted arrays
 */
public class MedianOfTwoArray {


    public int getMedian(int []arr1, int []arr2){



        if (arr1.length <= 0)
            return -1;
        if (arr1.length == 1)
            return (arr1[0] + arr2[0])/2;
        if (arr1.length == 2)
            return (Math.max(arr1[0], arr2[0]) + Math.min(arr1[1], arr2[1])) / 2;

        int median1=median(arr1,arr1.length);
        int median2=median(arr2,arr2.length);




        if(median1==median2){

            return median1;
        }else if(median1<median2){




            return getMedian(getSubArray(arr1,arr1.length/2,arr1.length-1),getSubArray(arr2,0,arr2.length/2));

        }else{



            return getMedian(getSubArray(arr1,0,arr1.length/2),getSubArray(arr2,arr2.length/2,arr2.length-1));

        }


    }

    public int[] getSubArray(int arr[], int start,int end){

        int a[]=new int[end-start+1];
        for(int i=start;i<=end;i++){

            a[i] = arr[i];

        }

        return a;

    }

    int median(int arr[], int n)
    {
        if (n%2 == 0)
            return (arr[n/2] + arr[n/2-1])/2;
        else
            return arr[n/2];
    }



    public static void main(String args[]){

        MedianOfTwoArray medianOfTwoArray=new MedianOfTwoArray();
        System.out.println(medianOfTwoArray.getMedian(new int[]{1, 12, 15, 26},new int[]{2, 13, 17, 30}));

    }




}
