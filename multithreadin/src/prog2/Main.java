package prog2;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(new Random().nextInt(10000));

//        thread.terminate();
        thread.interrupt();
    }
}
