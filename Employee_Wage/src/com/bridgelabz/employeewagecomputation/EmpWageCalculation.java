package com.bridgelabz.employeewagecomputation;

public class EmpWageCalculation {
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
		
		public static void computeEmpWage(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHrsInMonth) {
			int empHrs=0,totalEmpHrs=0, totalWorkingDays=0;
			while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays< numOfWorkingDays){
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
			int totalEmpWage=totalEmpHrs*empRatePerHour;
			System.out.println("Company: "+companyName+" Total wage: " + totalEmpWage);

		}
		public static void main(String[] args){
		System.out.println("Welcome to employee wage computation");
		computeEmpWage("dMart",20,4,10);
		computeEmpWage("wallmart",10,4,20);
	}

}
