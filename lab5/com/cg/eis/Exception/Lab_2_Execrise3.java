package com.cg.eis.exception
public class Lab_5_Exercise3
{
	public static void main(String[] args) 
	{
		double salary=4000;
		try
		{
			SalaryDetails(salary);
		}
		catch(EmployeeException e1)
		{
		  System.out.println("Salary is less than 3000");
		}	
	}
	public static void SalaryDetails(double salary) throws EmployeeException
	{
		if(salary<3000)
		{
			throw new EmployeeException();
		}
		else
		{
			System.out.println("Salary is greater to 3000");
		}		
	}
}
