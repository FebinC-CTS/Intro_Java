public class Exception1 {
    public static void main(String[] args) {
        try{
            int a = 100/0;
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }

        try{
            String str=null;
            str.length();
        }
        catch (NullPointerException n){
            System.out.println("Null Pointer Exception");
        }

        try{
            String str = "123"; 
            int num = Integer.parseInt(str); 
            System.out.println(num + 10);

            String str1="abc";
            int num1 = Integer.parseInt(str1);
            System.out.println(num1);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Unable to parse the string as an integer.");
        }

        int[] numbers = {1, 2, 3, 4, 5};
        try {    
            int index = 10; // Accessing an index that is out of bounds    
            int value = numbers[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index is out of bounds.");
        }
        
        finally{
            System.out.println("Basic example of try catch");
        }
    }
    
}
