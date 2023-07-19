package com.cg.day3;

public class TaxCalculation {
	public void calculateTax(Person per1) {
		if(per1.getAge()>65|| per1.getGender().equalsIgnoreCase("female")) {
			per1.setTax(0);
			System.out.println("Tax not applicable");
		} else {
			if(per1.getIncome()<=800000) {
				per1.setTax(0);
			}else if(per1.getIncome()>=800000 && per1.getIncome()<=2000000) {
				per1.setTax((per1.getIncome()-800000)*10/100);
			}else {
				per1.setTax((per1.getIncome()-800000)*25/100);
			}
		}
	}

}
