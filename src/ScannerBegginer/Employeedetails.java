package ScannerBegginer;

import java.util.Scanner;

public class Employeedetails {
	public void empdet() {
		// TODO Auto-generated method stub
	System.out.println("Employee Details");
	Scanner emp=new Scanner(System.in);
	
	
	System.out.println("Enter Employee ID");
	String EmpId=emp.next();
	System.out.println("Enter Employee Name");
	String EmpName=emp.next();
	System.out.println("Enter Employee Email");
	String EmpEmail=emp.next();
	System.out.println("Enter Employee Phone");
	int EmpPhone=emp.nextInt();
	System.out.println("Enter Employee Salary");
	Double EmpSalary=emp.nextDouble();
	System.out.println("Enter Employee Gender");
	String EmpGender=emp.next();
	System.out.println("Enter Employee City");
	String EmpCity=emp.next();
	
	System.out.println("Employee Id:"+EmpId);
	System.out.println("Employee Name:"+EmpName);
	System.out.println("Employee Email:"+EmpEmail);
	System.out.println("Employee Phone:"+EmpPhone);
	System.out.println("Employee Salary:"+EmpSalary);
	System.out.println("Employee Gender:"+EmpGender);
	System.out.println("Employee City:"+EmpCity);
	
	}
	public static void main(String[] args) {
		
		Employeedetails E=new Employeedetails();
		E.empdet();
		
}
}

