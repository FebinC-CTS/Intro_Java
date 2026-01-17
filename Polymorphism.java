class Animal4{
    void sound(){
        System.out.println("Animal makes a sound");
    }
    //Method overloading
    void sound(String animal){
        System.out.println(animal + " makes a sound");
    }
}

class Cat extends Animal4{
    //Method overriding
    @Override
    void sound(){
        System.out.println("Cat Meows...");
    }

    void sound1(){
        System.out.println("Cat hisses");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Animal4 a = new Animal4();
        Cat c = new Cat();
        Animal4 b = new Cat();
        a.sound();
        a.sound("Cat");
        c.sound();
        c.sound("Cat");
        c.sound1();
        b.sound(); //b.sound() works because sound() is overridden → runtime polymorphism calls Cat’s version.
        b.sound("Cat");
        //b.sound1(); Animal reference cannot access Cat-specific methods
    }
}