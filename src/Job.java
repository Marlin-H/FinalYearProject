public class Job {
    private int ID;
    private int timeRemaining;
    private int totalServiceTime;


    private int waitTime = 0;

    public Job(int ID, int totalServiceTime) {
        this.ID = ID;
        this.totalServiceTime = totalServiceTime;
        this.timeRemaining = totalServiceTime;

    }

    //I put ST for service time because its so long to have the full words
    public String toString() {
//        String details = "id:" + ID + " total ST:" + totalServiceTime + " wait:" + totalWaitTime + " remaining ST:";
//        if (timeRemaining == 0) {
//            return details + " --done--";
//        }
//        return details + timeRemaining;
        return "id:" + ID + " rm:" + timeRemaining + " wt:" + waitTime;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void decreaseTimeRemaining(int decrease) {
        timeRemaining -= decrease;
    }

    public void increaseWaitTime(int increase) {
        waitTime += increase;
    }

    public int getWaitTime() {
        return waitTime;
    }

}
