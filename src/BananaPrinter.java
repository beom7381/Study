public class BananaPrinter implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("banana");

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
