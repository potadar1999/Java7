package com.employee;

public class TemporaryEmployee extends Employee {

 private int hoursWorked;
 private int hourlyWages;
 
 
 
    public TemporaryEmployee() {
	super();
    }



    public TemporaryEmployee(int i, String string, int j, int k) {
	   super();
	   this.hoursWorked = hoursWorked;
	   this.hourlyWages = hourlyWages;
	   this.employeeId=employeeId;
	   this.employeeName=employeeName;
     }
 
    




	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		salary=hoursWorked*hourlyWages;
		
	}
	
}
