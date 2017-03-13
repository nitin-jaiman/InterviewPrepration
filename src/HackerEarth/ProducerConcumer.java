package HackerEarth;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by apple on 20/02/17.
 */
public class ProducerConcumer {

    Queue<Integer> ll=new LinkedList<>();
    private static final int count=2;


    public void producer() throws InterruptedException {

        synchronized (this) {

            while (true) {

                if (ll.size() == 2) {

                    try {

                        wait();


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {

                    ll.add((int) (Math.random()*100));
                    System.out.println("Produced "+ll.peek()+"  size  "+ll.size() );
                    notify();
                    Thread.sleep(1000);

                }


            }
        }

    }

        public void consumer() throws InterruptedException {

        synchronized (this) {
            while (true) {

                if (ll.size() == 0) {
                    wait();

                } else {

                    System.out.println("Consumed "+ll.poll()+"  size  "+ll.size());
                    notify();

                    Thread.sleep(1000);

                }


            }

        }
    }


    }





