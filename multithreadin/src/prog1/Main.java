package prog1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread1("MyThread1");
        Thread thread2 = new Thread(new MyThread2());

        thread1.start();
        thread2.start();
        Thread.sleep(100);

        Thread thread3 = new MyThread1("MyThread1");
        Thread thread4 = new Thread(new MyThread2());

        thread3.start();
        thread4.start();
        Thread.sleep(100);

        Thread thread5 = new MyThread1("MyThread1");
        Thread thread6 = new Thread(new MyThread2());

        thread5.start();
        thread6.start();
    }
}
