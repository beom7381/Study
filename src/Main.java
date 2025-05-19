public class Main {
    public static void main(String[] args) {
        AppleBanana();
    }

    public static void AppleBanana(){
        Thread appleThread = new Thread(new ApplePrinter());
        Thread bananaThread = new Thread(new BananaPrinter());

        appleThread.start();
        bananaThread.start();

        try {
            appleThread.join();
            bananaThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void hello(){
        HelloThread helloThread = new HelloThread();

        System.out.println("[main] 프로그램 시작");

        helloThread.start();

        try {
            helloThread.join();
        } catch (InterruptedException e) { }

        System.out.println("[main] 프로그램 종료");
    }
}