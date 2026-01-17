interface A5{
    void a5();
    void b5();
    void c5();
}

abstract class B5 implements A5{ //abstract can be used as we don't implement all methods of A5
    @Override
    public void c5(){
        System.out.println("I am in c");
    }
}

class M5 extends B5{  //no need of abstract as M5 implements all 3 methods of A5 (c5 method is implemented in B5, which is inherited)

    @Override
    public void a5(){
        System.out.println("I'm in a");
    }
    @Override
    public void b5(){
        System.out.println("I'm in b");
    }
}
public class AbstractEg {
    public static void main(String[] args) {
        M5 m1 = new M5();
        m1.a5();
        m1.b5();
        m1.c5();
    }
    
}
