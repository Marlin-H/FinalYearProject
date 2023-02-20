import java.util.LinkedList;

class Scratch {
    public static void main(String[] args) {
        LinkedList<Job> foo = new LinkedList<>();
        foo.add(new Job(1000, 123));
        foo.add(new Job(1001, 453));
        foo.add(new Job(1002, 234));
        Job bar = foo.get(0);
        System.out.println(foo);
        System.out.println(bar);
        foo.remove(bar);
        System.out.println(foo);

    }
}