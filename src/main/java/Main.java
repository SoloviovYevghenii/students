public class Main {
    public static void main(String[] args) {
        // Method 1: Using the Thread class
        MyThread myThread = new MyThread();
        myThread.start();

        // использование интерфейса Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        // Использование анонимного класса
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Using an anonymous class");
            }
        });
        thread2.start();

        // использование лямбда-выражения
        Thread thread3 = new Thread(() -> {
            System.out.println("Using a lambda expression");
        });
        thread3.start();

        //Увеличение потока
        IncrementThread.startIncrementThread();

        //Куриное яйцо
        ChickenEgg.startGame();
    }
}