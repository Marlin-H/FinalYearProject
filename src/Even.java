//Generates job in the current working format of ID;cpu_time_left

import java.util.Random;


public class Even implements Distribution {
    int ID = 0;
    int delay = 0;
    public Even(){

    }

    public Job next(){
        if(delay == 0){
            Job job = new Job(this.ID++, new Random().nextInt(10) + 1);
            delay = new Random().nextInt(10);
//            System.out.println("New delay set: " + delay);
            return job;
        }
        else {
            delay--;
            return null;
        }
    }
}
