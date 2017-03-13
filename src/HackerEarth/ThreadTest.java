package HackerEarth;

/**
 * Created by apple on 19/02/17.
 */
public class ThreadTest extends Thread{

    public  int count=0;



    public  void increment() throws InterruptedException {

synchronized (this) {
    for (int i = 0; i < 10000; i++) {
        count++;
        System.out.println("Count: " + count + " : Thread " + Thread.currentThread().getId());
           //  wait();
    }
}

    }  public  void decrement(){

synchronized (this) {
    for (int i = 0; i < 10000; i++) {
        count--;
        System.out.println("Count: " + count + " : Thread " + Thread.currentThread().getId());
        //notify();
    }
}

    }

    @Override
    public void run() {
       // super.run();

        synchronized (this) {
            try {
                increment();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
