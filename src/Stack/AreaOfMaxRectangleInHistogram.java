package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by apple on 11/03/17.
 */
public class AreaOfMaxRectangleInHistogram {



    public int getMaxArea(int arr[]){


        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> hmf=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hmb=new HashMap<Integer,Integer>();
        if(arr.length>0){

            stack.push(0);

        }

        for(int i=1;i<arr.length;i++){

            Integer x=stack.pop();

            while(x!=null&&arr[i]<arr[x]){

                hmf.put(x,i);

                if(stack.empty()) {
                    x = null;
                }else{
                    x=stack.pop();
                }


            }

            if(x!=null){
                stack.push(x);
            }

            stack.push(i);

        }

        while(!stack.empty()){

            Integer x=stack.pop();
            hmf.put(x,arr.length-1);


        }

        if(arr.length>0){

            stack.push(arr.length-1);

        }

        for(int i=arr.length-2;i>=0;i--){

            Integer x=stack.pop();

            while(x!=null&&arr[i]<arr[x]){

                hmb.put(x,i);
                if(stack.empty()) {
                    x = null;
                }else{

                    x=stack.pop();
                }


            }

            if(x!=null){
                stack.push(x);
            }

            stack.push(i);

        }

        while(!stack.empty()){

            Integer x=stack.pop();
            hmb.put(x,-1);


        }

        final int[] max = {Integer.MIN_VALUE};

        hmf.forEach((k,v)->{

            int height=arr[k];
            int f=v-1;
            int b=hmb.get(k);
            if(max[0] <height*(f-b)){
                max[0] =height*(f-b);

            }


        });



        return max[0];



    }


    public static void main(String args[]){


        AreaOfMaxRectangleInHistogram a=new AreaOfMaxRectangleInHistogram();
        int arr[]=new int[]{6,2,5,4,5,1,6};
        System.out.println(a.getMaxArea(arr));

    }



}
