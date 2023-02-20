import java.util.LinkedList;

abstract class Scheduler {
    public int clock = 0;
    public final Distribution distribution;
    LinkedList<Job> waiting = new LinkedList<>();
    public int totalServed = 0;
    public int totalWaitTime = 0;
    public int totalQueueLengthPerTick = 0;

    public Scheduler(Distribution distribution) {
        this.distribution = distribution;
    }

    public abstract void run(int ticks) throws InterruptedException;

    public void increaseWaitAll(){
        for (int i = 1; i < waiting.size(); i++) {
            waiting.get(i).increaseWaitTime(1);
        }
    }
}

//TODO why is this an abstract class not an interface?