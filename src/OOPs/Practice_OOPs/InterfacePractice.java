package OOPs.Practice_OOPs;

public class InterfacePractice implements Vehicle, Man{
    public static void main(String[] args) {

        InterfacePractice T1 = new InterfacePractice();
        T1.start();
        T1.walk();
    }

    @Override
    public void start() {
        System.out.println("Vehicle is Starting");
    }

    @Override
    public void walk() {
        System.out.println("Man is walking");
    }
}

interface Vehicle{
    void start();
}

interface Man{
    void walk();
}
