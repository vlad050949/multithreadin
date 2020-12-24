package prog1;

import java.util.Date;

public class MyThread2 implements Runnable {

    public void run() {
        Date date = new Date();

        System.out.println("Hello, I am MyThread2 " + date.toString());
    }
}
