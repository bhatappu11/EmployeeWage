package com.bridgelabz.employeewagecomputation;

public class EmpWageCalculation {
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
		
		private final String companyName;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHrsInMonth;
		
		
		public EmpWageCalculation(String companyName,int empRatePerHour,int numOfWorkignDays,int maxHrsInMonth) {
			this.companyName = companyName;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkignDays;
			this.maxHrsInMonth = maxHrsInMonth;
		}
		public void computeEmpWage() {
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
		EmpWageCalculation dMart = new EmpWageCalculation("D-Mart", 20, 10, 15);
		EmpWageCalculation metro = new EmpWageCalculation("Metro", 25, 8, 12);
		dMart.computeEmpWage();
		metro.computeEmpWage();
	}

}
