public class ThrowsDemo{

    // Method declares it may throw ArithmeticException
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b; // may throw ArithmeticException if b = 0
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // this will cause exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
