public class Exception2 {
    public static void main(String[] args) {
        try{      
            int a[]=new int[5];      
            a[5]=30/0;      
        }      
        catch(ArithmeticException e)    //this occurs first as RHS is evaluated 1st and then only assigned to LHS
        {    
            System.out.println("Arithmetic Exception occurs");  
        }      
        catch(ArrayIndexOutOfBoundsException e)    
        {    
            System.out.println("ArrayIndexOutOfBounds Exception occurs");    
        }      
        catch(Exception e)    //this occurs when no other exceptions are found
        {    
            System.out.println("Parent Exception occurs");    
        }               
        System.out.println("rest of the code");      
    }
}
