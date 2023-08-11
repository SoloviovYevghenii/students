public class ChickenEgg {
    public static void startGame() {
        Thread chickenThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Chicken");
            }
        });

        Thread eggThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Egg");
            }
        });

        chickenThread.start();
        eggThread.start();

        try {
            chickenThread.join();
            eggThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Game Over!");
    }
}