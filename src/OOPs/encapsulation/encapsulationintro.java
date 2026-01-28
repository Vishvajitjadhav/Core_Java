package OOPs.encapsulation;

public class encapsulationintro {
    public void doWork(){
        System.out.println("doing work in encapsulation");
    }

    public static void main(String[] args){

        Laptop L1 = new Laptop();
        L1.setPrice(25);

        System.out.println(L1.getPrice());
    }

}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        //is the user or admin
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("you cannot set price");
        }
        else{
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
