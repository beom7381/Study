public class ApplePrinter implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("apple");

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
