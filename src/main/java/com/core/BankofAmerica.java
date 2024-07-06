package com.core;

public class  BankofAmerica implements WellsFargo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankofAmerica ba=new BankofAmerica();
	ba.EducationalLoan();
	ba.furnitureLoan();
	ba.homeLoan();
	}
	
	public void EducationalLoan() {
		// TODO Auto-generated method stub
		System.out.println("educationa Loan interst is 15%");
	}
	public void homeLoan() {
		// TODO Auto-generated method stub
		System.out.println("homeloan interst rate is 10%");
	}
	public void furnitureLoan() {
		// TODO Auto-generated method stub
		System.out.println("furnitureloan interst rat is 15");
	}	
	}
