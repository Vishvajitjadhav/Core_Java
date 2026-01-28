package OOPs.Basic;

// Class & Object
// Methods/Function, overloading
// Polymorphism, compile time
// Static, this, Super keyword
// Inheritance
// Access modifier
// Encapsulation
// Abstraction
//Interface
public class Basic {
    public static void main(String args[]){
        Person p1 = new Person(); // Object
        p1.name = "Vishvajit";
        p1.age = 22;

        Person p2 = new Person("Bhakti", 24);

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        p1.eat();
        p2.walk();
        p2.walk(50);

        System.out.println(Person.count);//Static call
    }
}


//Class
class Person{
    String name;
    int age;

    static int count;

    public Person(){
        System.out.println("Creating constructor");
        count++;
    }

    //Overloading
    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    //Method/Function
    void eat(){
        System.out.println(name + " " + "is eating Pavbhaji");
    }
    void walk(){
        System.out.println(name + " " + "is walking");
    }
    void walk(int steps){ // arguments
        System.out.println(name + " walked " + steps + " steps");
    }
}
// Can create multiple objects of one class.
