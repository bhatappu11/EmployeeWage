package com.bridgelabz.employeewagecomputation;

public class CompanyEmployeeWage {
	public final String companyName;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHrsInMonth;
	public int totalEmpWage;
	
	public CompanyEmployeeWage(String companyName,int empRatePerHour,int numOfWorkignDays,int maxHrsInMonth) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkignDays;
		this.maxHrsInMonth = maxHrsInMonth;

	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total employee wage for "+companyName+" is : "+totalEmpWage;
	}
	
	
}