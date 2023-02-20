public class FCFS extends Scheduler {

    public FCFS(Distribution distribution) {
        super(distribution);
    }

    public void run(int ticks) throws InterruptedException {
        while (super.clock < ticks) {
            super.clock++;
            Job nextToEnqueue = distribution.next();
            if (nextToEnqueue != null) {
                waiting.add(nextToEnqueue);
            }
//            System.out.println(waiting);
            if (!waiting.isEmpty()) {
                Job currentlyServed = waiting.get(0);
                service(currentlyServed);
                if (currentlyServed.getTimeRemaining() == 0) {
                    super.totalWaitTime += currentlyServed.getWaitTime();
                    waiting.remove(currentlyServed);
                    super.totalServed++;
                }
            }
            super.totalQueueLengthPerTick += waiting.size();
            super.increaseWaitAll();
//            Thread.sleep(1);

        }
        System.out.println("Total served: " + super.totalServed);
        System.out.println("Average wait: " + (double) super.totalWaitTime/super.totalServed);
        System.out.println("Average queue length: " + (double) super.totalQueueLengthPerTick/super.clock);
    }

    private void service(Job job) {
        job.decreaseTimeRemaining(1);
    }
}
