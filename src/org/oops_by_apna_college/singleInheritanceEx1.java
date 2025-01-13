package org.oops_by_apna_college;
//Base or Super Class
class Employee{
	int salary =60000;
	int benefits=10000;
}

//Inherited or Sub Class
class Engineer extends Employee{
}

//Driver Class
public class singleInheritanceEx1 {

	public static void main(String[] args) {
		Engineer E= new Engineer();
		System.out.println("Salary : "+ E.salary+" "+"Benefits : "+E.benefits);
	}

}
