package prog2;

public class MyThread extends Thread{
//    private boolean run = true;
//    @Override
//    public void run() {
//        while (run) {
//            System.out.println("Trying to connect...");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    void terminate() {
//        run = false;
//    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                System.out.println("Trying to connect...");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                interrupt();
            }
        }
    }
}
