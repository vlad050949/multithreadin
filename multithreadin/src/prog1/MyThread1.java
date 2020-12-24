package prog1;

import java.util.Date;

public class MyThread1 extends Thread {
    MyThread1 (String name) {
        super(name);
    }
    @Override
    public void run() {
        Date date = new Date();

        System.out.println("Hello, I am MyThread1 " + date.toString());
    }
}
