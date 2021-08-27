package com.bridgelabz.employeewagecomputation;

public class EmpWageCalculation {
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
		
		private int numOfCompany = 0;
		private CompanyEmployeeWage[] companyEmpWageArray;
		public EmpWageCalculation() {
			companyEmpWageArray = new CompanyEmployeeWage[5];
		}
		private void addCompanyWage(String companyName,int empRatePerHour,int numOfWorkignDays,int maxHrsInMonth) {
			companyEmpWageArray[numOfCompany] = new CompanyEmployeeWage(companyName, empRatePerHour, numOfWorkignDays, maxHrsInMonth);
			numOfCompany++;
		}
		private void computeEmpWage() {
			for(int i=0;i<numOfCompany;i++) {
				companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
				System.out.println(companyEmpWageArray[i]);
			}
		}
		
		private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
			int empHrs=0,totalEmpHrs=0, totalWorkingDays=0;
			while(totalEmpHrs <= companyEmployeeWage.maxHrsInMonth && totalWorkingDays< companyEmployeeWage.numOfWorkingDays){
				totalWorkingDays++;
				int empCheck = (int)Math.floor(Math.random() * 10)%3;
				switch(empCheck) {
					case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;
					default:
						empHrs=0;
					}
				totalEmpHrs+=empHrs;
				System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
				}
			return totalEmpHrs*companyEmployeeWage.empRatePerHour;

		}
		public static void main(String[] args){
		System.out.println("Welcome to employee wage computation");
		EmpWageCalculation empWageBuilder = new EmpWageCalculation();
		empWageBuilder.addCompanyWage("Metro", 25, 8, 12);
		empWageBuilder.addCompanyWage("D-Mart", 20, 5, 10);
		empWageBuilder.computeEmpWage();
	}

}
