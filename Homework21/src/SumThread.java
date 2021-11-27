public class SumThread extends Thread {

    private final int from;
    private final int to;
    private int sum = 0;


    public SumThread(int from, int to) {

        this.from = from;
        this.to = to;

    }

    @Override
    public void run() {

        for (int i = from; i < to; i++) {

            sum += Main.array[i];

        }

    }

    public int getSum() {
        return sum;
    }

}
