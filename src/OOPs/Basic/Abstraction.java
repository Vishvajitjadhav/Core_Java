package OOPs.Basic;

public class Abstraction {
    public static void main(String[] args){
        BMW c1 = new BMW();
    }

}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is Starting");
    }
}

class XUV extends Car{

    @Override
    void start() {
        System.out.println("XUV is Starting");
    }
}
abstract class Car{ // now we can't create obj of Car
    int price;
    abstract void start(); // no need to write implementation

}
