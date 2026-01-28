package OOPs.Basic;

import OOPs.encapsulation.encapsulationintro;

//Inheritance
public class Inheritance {
    public static void main(String args[]){

        Employee p2 = new Employee("Vishvajit", 24);

        Developer d1 = new Developer("Bhakti", 23);
        d1.eat();
        d1.walk();

        // Check access modifiers
        encapsulationintro obj = new encapsulationintro();
        obj.doWork();
    }
}

//Inheritance
class Developer extends Employee{

    public Developer(String name, int age) {
        super(name, age);
    }

    void walk(){
        System.out.println("Developer " + name + " " + "is walking");
    } // In runtime this walk will assign to developer so its runtime polymorphism
}

//Class
class Employee{
    protected String name;
    int age;
    static int count;

    //Overloading
    public Employee(String name, int age){
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
