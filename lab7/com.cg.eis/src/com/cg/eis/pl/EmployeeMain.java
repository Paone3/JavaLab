package com.cg.eis.pl;

import com.cg.eis.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.getDesignation(), emp1.getSalary());
		Employee person = new Employee(emp1.getId(),emp1.getName(),emp1.getSalary(),scheme,emp1.getDesignation());
		
		//System.out.println(emp1.name);
		//emp.insuranceScheme();
		emp.EmpDetails(person);
		

	}

}