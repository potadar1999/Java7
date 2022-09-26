package com.employee;

public class PermanentEmployee extends Employee{

	private double basicPay;
	
	
	public PermanentEmployee() {
		super();
	}



	public PermanentEmployee(int i, String string, int j)  {
		super();
		this.basicPay = basicPay;
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}

	

	double PFamount= basicPay * 0.12;

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
		salary=basicPay-PFamount;
		
	}
	
	
	
	

	

}
