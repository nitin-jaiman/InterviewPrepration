package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by apple on 14/02/17.
 */
public class Test {

    public static void main(String args[]) throws IOException {




        ProducerConcumer p=new ProducerConcumer();

        Thread t11=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    p.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
          Thread t12=new Thread(new Runnable() {
            @Override
            public void run() {

              //  ProducerConcumer p=new ProducerConcumer();
                try {
                    p.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        t11.start();
        t12.start();

        try {
        t11.join();

            t12.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
