package HackerEarth;

import Tree.TreeTraversal;

/**
 * Created by apple on 16/02/17.
 */
public class B implements P1,P2{


    @Override
    public void show() {

        P1.super.show();
        P2.super.show();

    }

    public static void main(String args[]) throws CloneNotSupportedException {


        B b=new B();
        b.show();


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }



}
