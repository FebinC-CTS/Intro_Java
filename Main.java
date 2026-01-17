class Animal{    
    Animal(){System.out.println("Animal is created");} 
    void eat(){
        System.out.println("Animal is eating");
    }   
}    
class Dog extends Animal{    
    Dog(){    
        super();  //calls the constructor of parent class  
        System.out.println("Dog is created");   
        super.eat(); //calls the eat method of super class
    }    
}    
public class Main{    
    public static void main(String args[]){    
        Dog d=new Dog();    
    }  
}    