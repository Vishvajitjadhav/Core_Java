package OOPs.Practice_OOPs;

public class AbstractionPractice {
    public static void main(String[] args) {

        Audi c = new Audi();
        c.start();
    }
}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

abstract class Car{
    String brand;
    int price;

    abstract void start();



}
