class Animal2 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal2 a = new Dog2();   // Upcasting (safe)
        a.sound(); 
        //a.bark();    won't work        

        Dog2 d = (Dog2) a;        // Downcasting (explicit)
        d.bark();               // Now subclass-specific method accessible
    }
}
