import java.util.ArrayList;
import java.util.Scanner;

class BankAccount{
	long acc_no;
	String name;
	double balance;
	
	BankAccount(long acc_no, String name, double balance) {
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
	}
	
	void createAccount(long acc_no,String name, double balance) {

	}
}

class Transaction{
	long acc_no;
	String type;
	double amount;
	double balance;
	String date;
	
	Transaction(Long acc_no, String type,double amount,double balance, String date) {
		this.acc_no=acc_no;
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.date=date;
	}
	
	@Override
	public String toString(){
		return "DD/MM/YYYY		"	+acc_no +" 	"+type+"	"+"Amount: "+amount+"		"+"Bal: "+balance;
	}
	
	
}
public class Exam2Bank {
	
	public static BankAccount findAccount(ArrayList<BankAccount> bankAccounts, long acc_no) { 
		for (BankAccount acc : bankAccounts) { 
			if (acc.acc_no == acc_no) 
				return acc; 
			} 
			return null; 
			}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> bankacc = new ArrayList<>();
		ArrayList<Transaction> transactions = new ArrayList<>();
		
		while(true) {
			System.out.println("1. Register as New User");
			System.out.println("2. Credit");
			System.out.println("3. Debit");
			System.out.println("4. Print Passbook");
			System.out.println("5. Exit");
			int choice=sc.nextInt();
		
		switch(choice) {
		case 1: {
			System.out.println("Enter Acc_no");
			long acc_no=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			bankacc.add(new BankAccount(acc_no,name,0.00));
			System.out.println("Account Created Successfully!");
			break;
		}
		case 2: {
			System.out.println("Enter Account No: ");
			long acc_no =sc.nextLong();
			System.out.println("Enter Amount to Credit: ");
			double amount = sc.nextDouble();
			BankAccount acc = findAccount(bankacc, acc_no);
			if (acc != null) { 
				acc.balance += amount; 
				transactions.add(new Transaction(acc_no, "Credit", amount, acc.balance, java.time.LocalDate.now().toString())); 
				System.out.println("Amount credited. New Balance: " + acc.balance); 
				} 
			else { 
				System.out.println("Account not found!"); 
				} 
			break;
			}
		case 3: { 
			System.out.print("Enter Account No: "); 
			long acc_no = sc.nextLong(); 
			System.out.print("Enter Amount to Debit: "); 
			double amount = sc.nextDouble(); 
			BankAccount acc = findAccount(bankacc, acc_no); 
			if (acc != null) { 
				if (acc.balance >= amount) { 
					acc.balance -= amount; 
					transactions.add(new Transaction(acc_no, "Debit", amount, acc.balance, "DD/MM/YYYY")); 
					System.out.println("Amount debited. New Balance: " + acc.balance); 
					} 
				else { 
					System.out.println("Insufficient balance!"); 
					} 
				} 
			else { 
				System.out.println("Account not found!"); 
				} break;
		}
		case 4: { 
			System.out.print("Enter Account No: "); 
			long acc_no = sc.nextLong(); 
			System.out.println("Passbook for Account " + acc_no + ":"); 
			for (Transaction t : transactions) { 
				if (t.acc_no == acc_no) { 
					System.out.println(t); 
					} 
				} break;
		}
		case 5:{
			System.out.println("Exiting...");
			sc.close();
			return;
		}
		default: System.out.println("Invalid Choice!");
		}
	}
		
		
		
		
	}
}