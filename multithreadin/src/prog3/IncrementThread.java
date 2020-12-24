package prog3;

public class IncrementThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++)
            Main.inc();
    }
}
