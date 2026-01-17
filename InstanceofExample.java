interface Printable{};
class A implements Printable{
    public void a(){
        System.out.println("a method");
    }
}

class B implements Printable{
    public void b(){
        System.out.println("b method");
    }
}

class Call{
    void invoke(Printable p){
        if(p instanceof A){ //checks if p is actually an object of class A.
            A a1 = (A)p; //If true, it downcasts p to A and calls a().
            a1.a();
        }
        if(p instanceof B){ //checks if p is actually an object of class B.
            B b1=(B)p; //If true, it downcasts p to B and calls b().
            b1.b();
        }
    }
}

class InstanceofExample{
    public static void main(String[] args) {
        Printable p = new B();
        Call c= new Call();
        c.invoke(p);
    }
}