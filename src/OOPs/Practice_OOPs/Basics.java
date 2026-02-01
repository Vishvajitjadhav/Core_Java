package OOPs.Practice_OOPs;

public class Basics {
    public static void main(String[] args) {

        Person p1 = new Person(23, "Bhakti");

        Person p2 = new Person();
        p2.name= "vishvajit";

        p1.walk();
        p2.walk(2);

        System.out.println(Person.count);

        Developer d1 = new Developer(24, "Samarth");
        d1.walk();
    }
}

class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
    }
    void walk(){
        System.out.println("Developer " + name + " is walking");
    }
}

class Person{
    protected String name;
    int age;

    static int count;

    public Person(){
        count++;
        System.out.println("Checking constructor");
    }

    public Person(int age, String name){
        this();
        this.age = age;
        this.name = name;
    }

    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){ // arguments
        System.out.println(name + " walked " + steps + " steps");
    }
}
