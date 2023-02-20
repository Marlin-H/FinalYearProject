import java.util.Random;

public class Geometric implements Distribution{
    int ID = 0;
    int delay = 0;

    public Geometric(){
    }

    @Override
    public Job next(){
        if(delay == 0){
            Job job = new Job(this.ID++, geometric(2));
            delay = geometric(2);
//            System.out.println("New delay set: " + delay);
            return job;
        }
        else {
            delay--;
            return null;
        }
    }

//    TODO you absolutely need some useful documentation here what p is until you replace the random
    public int geometric(int p){
        int val = 1;
        int n = new Random().nextInt(p);
        while (n != 0){
            val++;
            n = new Random().nextInt(p);
        }
        return val;
    }
}
