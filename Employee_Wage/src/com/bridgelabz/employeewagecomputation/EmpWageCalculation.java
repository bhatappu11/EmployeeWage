package com.bridgelabz.employeewagecomputation;

public class EmpWageCalculation {
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
		
		private final String companyName;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHrsInMonth;
		
		public EmpWageCalculation(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHrsInMonth) {
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHrsInMonth = maxHrsInMonth;
			this.companyName = companyName;
		}
		public static void computeEmpWage(EmpWageCalculation company) {
			int empHrs=0,totalEmpHrs=0, totalWorkingDays=0;
			while(totalEmpHrs <= company.maxHrsInMonth && totalWorkingDays< company.numOfWorkingDays){
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
			int totalEmpWage=totalEmpHrs*company.empRatePerHour;
			System.out.println("company: "+company.companyName+" Total wage: " + totalEmpWage);

		}
		public static void main(String[] args){
		System.out.println("Welcome to employee wage computation");
		EmpWageCalculation dMart = new EmpWageCalculation("D-MART", 20, 5, 12);
		EmpWageCalculation metro = new EmpWageCalculation("METRO", 22, 8, 10);
		computeEmpWage(dMart);
		computeEmpWage(metro);
	}

}
