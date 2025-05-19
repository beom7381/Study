public class SyncThread extends Thread {
    NumberContainer numberContainer;

    public SyncThread(NumberContainer numberContainer){
        this.numberContainer = numberContainer;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            numberContainer.increaseCount();
        }
    }
}

