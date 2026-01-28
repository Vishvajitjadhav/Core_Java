package OOPs.Basic;

public class Interfaces implements Vehicle, Man{

    public static void main(String[] args){
        //Example is Transformer
        Interfaces T1 = new Interfaces();
    }
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void walk() {
        System.out.println("Man is walking");
    }
}

interface Vehicle {
    void start();
    //bydefault public abstract
}

interface Man{
    void walk();
}
