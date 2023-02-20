
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int trial = 1;
        while(true) {
            System.out.println("trial " + trial++);
            double time = System.currentTimeMillis();
            new FCFS(new Geometric()).run(10000);
            time = (System.currentTimeMillis() - time)/1000;
            System.out.println("Run time seconds: " + time);
            System.out.println();
        }
    }
}

//TODO fix the avg wait time&queue length thing