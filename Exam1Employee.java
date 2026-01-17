import java.util.*;

class Employee{
	String EmpName;
	String EmpType;
	
	Employee(String EmpName, String EmpType){
		this.EmpName=EmpName;
		this.EmpType=EmpType;
	}
	
}

public class Exam1Employee{
	static HashMap<String,Employee> emp= new HashMap <>();
	static Scanner sc = new Scanner(System.in);
	final static int basic = 50000;
	final static int hra = 15000;
	final static int da = 10000;
	final static int deductions = ((basic)/100)*35;
	
	final static int ftit = ((basic + hra + da)/100)*35;
	final static int ftsal=basic+hra+da-(deductions+ftit);
	
	final static int cit = ((basic + hra + da)/100)*10;
	final static int csal=basic+hra+da-(cit);

	final static int isal=basic;

	public static void main(String[] args) {
		
		
		emp.put("E526",new Employee("Lolan","FT"));
		emp.put("E521",new Employee("Febin","FT"));
		emp.put("E725",new Employee("Rohith","Contractor"));
		emp.put("E729",new Employee("Rahul","Contractor"));
		emp.put("E915",new Employee("Ramesh","Intern"));
		emp.put("E922",new Employee("Aravindh","Intern"));
	
		int choice;

		do {
		System.out.println("\n======= Employee Payroll System =======");
		System.out.println("1. Display the Details by ID... Enter Employee ID: ");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		System.out.println("Enter Your Choice");

		choice = sc.nextInt();
		
		switch (choice) {
		
		case 1: {
			System.out.println("Enter Employee ID: ");
			String a = sc.next();
			Employee e = emp.get(a);
			if(e!=null) {
				System.out.println("\nEmp ID: "+a+"\nEmp Name: "+e.EmpName+"\nEmp Type: "+e.EmpType);
				System.out.print("Salary :" );
				if(e.EmpType.equalsIgnoreCase("FT"))
					System.out.println(ftsal);
				if(e.EmpType.equalsIgnoreCase("Contractor"))
					System.out.println(csal);
				if(e.EmpType.equalsIgnoreCase("Intern"))
					System.out.println(isal);
			}
			else {
				System.out.println("Employee not found!");
			}
			break;

		}
		case 2: {
			System.out.println("Displaying All");
			for (Map.Entry<String, Employee> entry : emp.entrySet()) {
				System.out.println("\nEmp ID: " + entry.getKey() + "\nName: " + entry.getValue().EmpName + "\nType: " + entry.getValue().EmpType);
				System.out.print("Salary :" );
				if(entry.getValue().EmpType.equalsIgnoreCase("FT"))
					System.out.println(ftsal);
				if(entry.getValue().EmpType.equalsIgnoreCase("Contractor"))
					System.out.println(csal);
				if(entry.getValue().EmpType.equalsIgnoreCase("Intern"))
					System.out.println(isal);			
			}
			break;

		}
		case 3:{
			System.out.println("Exiting...");
			break;
		}
			
		default:
			System.out.println("Invalid choice!");
		} 
		}while(choice!=3);

	}
	
	
	
}