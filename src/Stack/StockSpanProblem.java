package Stack;

import java.util.Stack;

/**
 * Created by apple on 28/03/17.
 */
public class StockSpanProblem {

    public int[] getStockSpan(int arr[]){

        Stack<Integer> stack=new Stack<>();

        int r[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){


                while(!stack.isEmpty()&&arr[stack.peek()]<=arr[i]){

                    r[stack.peek()]=stack.peek()-i;
                    stack.pop();

                }

                stack.push(i);


        }

        while (!stack.empty()){

            r[stack.pop()]=-1;

        }


        return r;
    }


    public static void main(String args[]){


        StockSpanProblem stockSpanProblem=new StockSpanProblem();
       int r[]=stockSpanProblem.getStockSpan(new int[]{100,80,60,70,60,75,85});

        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }

    }


}
