interface Printable{
    void print();
}

interface Showable{
    void show();
}

class AImplementing implements Printable, Showable{
    public void print(){
        System.out.println("Printable is printing");
    }
    public void show(){
        System.out.println("Showable is showing");
    }
}

public class MultipleInterface{
    public static void main(String[] args) {
        AImplementing ai= new AImplementing();
        ai.print();
        ai.show();
    }
}