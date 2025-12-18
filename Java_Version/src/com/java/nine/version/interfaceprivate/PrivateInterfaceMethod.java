package com.java.nine.version.interfaceprivate;

public class PrivateInterfaceMethod implements Employee {
	public static void main(String[] args) {
		Employee emp=new PrivateInterfaceMethod();
		emp.getEmployee();
	}

}

interface Employee{
	default void getEmployee() {
		getEmployeeListStartingWithZ();
		System.out.println("get Employee");
		}
	
		static void getEmployeeListStartingWithZ() {
		printEmployeeList();
		System.out.println("get EmployeeList Starting With Z");
		}
		
		private static void printEmployeeList() {
			System.out.println("print Employee List");
		}
}

/*Output
print Employee List
get EmployeeList Starting With Z
get Employee*/
