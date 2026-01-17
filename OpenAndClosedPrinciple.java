import java.util.Scanner;

interface Payment{
    public void makePayment();
}

class CreditCardPayment implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Paying through Credit Card...");
    }
}

class UPIPayment implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Paying through UPI...");
    }
}

public class OpenAndClosedPrinciple{
    public static void main(String[] args){
        Payment obj = null;
        System.out.println("Which payment option: UPI/CC?");
        Scanner sc = new Scanner(System.in);
        String paymenttype=sc.next();
        if (paymenttype.equals("UPI"))
            obj = new UPIPayment();
        else if (paymenttype.equals("CC"))
            obj = new CreditCardPayment();
        obj.makePayment();
        sc.close();
    }
}