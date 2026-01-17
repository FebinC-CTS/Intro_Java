interface Cubing{
    void draw();
    static int cube(int n){ //not inherited by the inherited child class
        return n*n*n;
    }
}

class Drawing implements Cubing{
    public void draw(){
        System.out.println("Drawing...");
    }
}

/*  Drawing drawing = new Drawing();   // reference type = class | You can call all methods defined in Drawing (including those inherited from Cubing)
    Cubing cubing = new Drawing();    // reference type = interface | You can only call methods declared in the Cubing interface.
 */


public class StaticMethinInterface{
    public static void main(String[] args) {        
        // Drawing drawing = new Cubing();   // You cannot instantiate an interface directly with new Cubing().

        Drawing drawing = new Drawing();
        drawing.draw();   

        // drawing.cube(5);      // ❌ error, because cube() is static in Cubing
        //System.out.println(drawing.cube(5)); Error, as static don't need object creation

        System.out.println(cube(5));
    }
}