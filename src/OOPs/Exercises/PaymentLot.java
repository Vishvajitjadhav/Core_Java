package OOPs.Exercises;

public class PaymentLot {
    public static void main (String[] args){

        Payment P1 = new UPI();
        P1.processPayment(500.0);
    }
}

class UPI implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via UPI");
    }
}

class CreditCard implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Credit Card");
    }
}

class NetBanking implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Net Banking");
    }
}

interface Payment{
    void processPayment(double amount);
}
