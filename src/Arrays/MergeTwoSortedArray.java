package Arrays;

/**
 * Created by apple on 02/03/17.
 */
public class MergeTwoSortedArray {

    public static void main(String args[]){

        int arr[]=new int[7];

        arr[0]=2;
        arr[2]=7;
        arr[5]=10;

        int n[]=new int[]{5,8,12,14};

        int end=arr.length-1;

        printArray(arr);

        for(int i=end;i>0;i--){

            if(arr[i]!=0){

                while(arr[end]!=0){

                    end--;

                }
                arr[end]=arr[i];
                arr[i]=0;

            }

        }

        printArray(arr);

        if(arr[end]==0){
            end++;

        }

        int j=0;
        int i=0;

        printArray(arr);
        while(j<n.length){

           if(n[j]<arr[end]){

               arr[i]=n[j];
               i++;
               j++;

           } else{

               arr[i]=arr[end];
               i++;
               end++;
           }


        }
        printArray(arr);


    }



    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }

}
