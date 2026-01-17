class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Student2 {
    String name;
    Address address; // Aggregation (Student HAS-A Address)

    Student2(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(name + " lives in " + address.city + ", " + address.state);
    }
}

public class Aggregation{
    public static void main(String[] args) {
        Address addr = new Address("Kochi", "Kerala");
        Student2 s1 = new Student2("Febin", addr);

        s1.display();
    }
}
