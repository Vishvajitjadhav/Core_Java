package OOPs.Practice_OOPs;

public class EncapsulationPractice {

    public static void main(String[] args) {
        Hotel h1 = new Hotel();

        h1.setPrice(5000, true);
        h1.setRooms(10);

        System.out.println("Price : " + h1.getPrice());
        System.out.println("Rooms : " + h1.getRooms());
    }
}

class Hotel{
    private int rooms;
    private double price;

    public void setPrice(double price, boolean isManager){
        // is manager
        if(!isManager){
            System.out.println("You cannot access");
        }
        if(price <= 0){
            System.out.println("invalid price");
        }
        else{
            this.price = price;
        }
    }

    public double getPrice(){ return price;}

    public double getRooms(){ return rooms;}

    public void setRooms(int rooms){ this.rooms = rooms;}

}
