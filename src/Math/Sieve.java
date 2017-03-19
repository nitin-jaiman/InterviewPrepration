package Math;

/**
 * Created by apple on 18/03/17.
 */
public class Sieve {

    public void printPrimes(int n){

        boolean arr[]=new boolean[n+1];
        for(int i=2;i<=n;i++){arr[i]=true;}

        for(int i=2;i*i<=n;i++){

            for(int j=i+1;j<=n;j++){

                if(arr[j]) {

                    if (j % i == 0) {

                        arr[j] = false;

                    }
                }
            }

        }

        for(int i=1;i<=n;i++){

            if(arr[i]){
                System.out.println(i);
            }

        }

    }


    public static void main(String args[]){

        Sieve sieve=new Sieve();
        sieve.printPrimes(50);

    }

}
