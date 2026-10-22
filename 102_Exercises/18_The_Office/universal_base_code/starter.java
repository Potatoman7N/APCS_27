/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		pam.employeeToString();
		Employee robin = new Employee(3940, "Robin", "Dabank", 100000.00);
		robin.employeeToString();
		michael.raiseSalary(100);
		dwight.raiseSalary(50);
		jim.raiseSalary(20);
		pam.raiseSalary(40);
		robin.raiseSalary(120);
		michael.employeeToString();
		System.out.println("Employee Annual Salary: " + michael.getAnnualSalary());
		dwight.employeeToString();
		System.out.println("Employee Annual Salary: " + dwight.getAnnualSalary());
		jim.employeeToString();
		System.out.println("Employee Annual Salary: " + jim.getAnnualSalary());
		pam.employeeToString();
		System.out.println("Emloyee Annual Salary: " + pam.getAnnualSalary());
		robin.employeeToString();
		System.out.println("Employee Annual Salary: " + robin.getAnnualSalary());

		
	}
}
