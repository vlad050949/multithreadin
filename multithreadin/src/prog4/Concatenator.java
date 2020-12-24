package prog4;

public class Concatenator extends Thread{
    private static final Object monitor = new Object();
    private String str;

    Concatenator() {
        str = "";
    }

    @Override
    public void run() {
        concatenateString();
    }

    void concatenateString() {
        synchronized (monitor) {
            for (int i = 0; i < 20000; i++)
                str = str.concat("0");
            monitor.notify();
        }
    }
    void showLength() throws InterruptedException {
        synchronized (monitor) {
            monitor.wait();
            System.out.println(str.length());
        }
    }
}
