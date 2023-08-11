public class IncrementThread implements Runnable {
    private static int value = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            value++;
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Value: " + value);
        }
    }

    public static void startIncrementThread() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new IncrementThread());
            thread.start();
        }
    }
}
