
package HackerEarth;

public class Edfora{


    public static void main(String args[])
    {

        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};


        int i=0;
        int length=arr.length-1;

        printArray(arr);

        /*
        while(i<=(length-i)){

            swap(arr,i,length-i);

            i++;
        }*/

        Edfora edfora=new Edfora();
        edfora.recursive(arr,i,length);

        printArray(arr);

    }

    public void recursive(int arr[],int i,int j){


        if(i>j){

            return;
        }

        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        recursive(arr,i+1,j-1);

    }


    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }

    public static void swap(int arr[],int i,int j){


        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }




}

