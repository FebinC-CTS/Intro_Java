abstract class Animal1{
    public abstract void sound();
}

class Dog1 extends Animal1{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
public class Abstraction{
    public static void main(String args[]){
        Dog1 d = new Dog1();
        d.sound();
    }
}