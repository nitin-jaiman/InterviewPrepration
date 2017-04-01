package Stack;

import java.util.Stack;

/**
 * Created by apple on 28/03/17.
 */
public class QueueWithStack {

   private Stack<Integer> st1=new Stack<>();
    private  Stack<Integer> st2=new Stack<>();



    public void push(Integer i){

        if(st1.empty()){

            transferElements(st2,st1);

        }

        st1.push(i);

    }

    private void transferElements(Stack<Integer> from,Stack<Integer> to){

        while(!from.empty()){

            to.push(from.pop());

        }

    }

    public void pop(){


        if(st2.empty()){

            transferElements(st1,st2);

        }

        if(!st2.empty()) {
            System.out.println("Popped item- " + st2.pop());
        }

    }



    public static void main(String args[]){


        QueueWithStack q=new QueueWithStack();
        q.push(1);
        q.push(2);
        q.push(3);

        q.pop();
        q.pop();
        q.pop();

    }


}
