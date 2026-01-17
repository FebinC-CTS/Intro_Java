public class Staticmethod1{

    static void greet(){
        System.out.println("Hello");
    }

    void farewell(){
        System.out.println("Goodbye");
    }

    public static void main(String[] args){
        Staticmethod1 obj=new Staticmethod1();
        obj.farewell();
        //Staticmethod1.greet();
        greet();
    }
}



