package prog3;

public class Main {
    private static int counter;

    Main() {
        counter = 0;
    }

    public static void main(String[] args) throws InterruptedException {
        IncrementThread thread1 = new IncrementThread();
        IncrementThread thread2 = new IncrementThread();
        IncrementThread thread3 = new IncrementThread();

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter);
    }

    synchronized static void inc() {
        counter++;
    }
}
