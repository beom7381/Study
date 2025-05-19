public class Main {
    public static void main(String[] args) {
        SyncThreadTest();
    }

    public static void SyncThreadTest() {
        NumberContainer nc = new NumberContainer();
        SyncThread syncTask1 = new SyncThread(nc);
        SyncThread syncTask2 = new SyncThread(nc);
        SyncThread syncTask3 = new SyncThread(nc);

        syncTask1.start();
        syncTask2.start();
        syncTask3.start();

        try {
            syncTask1.join();
            syncTask2.join();
            syncTask3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(nc.getCount());
    }

    public static void AppleBanana() {
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

    public static void hello() {
        HelloThread helloThread = new HelloThread();

        System.out.println("[main] 프로그램 시작");

        helloThread.start();

        try {
            helloThread.join();
        } catch (InterruptedException e) {
        }

        System.out.println("[main] 프로그램 종료");
    }
}