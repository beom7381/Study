public class NumberContainer{
    private int count;

    public NumberContainer(){
        count = 0;
    }

    public synchronized void increaseCount(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
