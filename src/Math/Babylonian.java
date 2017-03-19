package Math;

/**
 * Created by apple on 18/03/17.
 */
public class Babylonian {

    public double getSqrRoot(int n){


        double x=n;
        double y=1;

        while((x-y)>0.000001){

            x=(x+y)/2;
            y=n/x;


        }



        return x;

    }

    public static void main(String args[]){

        Babylonian b=new Babylonian();
        System.out.println(b.getSqrRoot(2));


    }


}
