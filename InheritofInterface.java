interface Interface1{
    void print();
}

interface Interface2 extends Interface1{
    void show();
}

class PrintShow implements Interface2{
    public void print(){
        System.out.println("Printing...");
    }
    public void show(){
        System.out.println("Showing...");
    }
}

public class InheritofInterface{
    public static void main(String[] args) {
        PrintShow ps = new PrintShow();
        ps.print();
        ps.show();
    }
}