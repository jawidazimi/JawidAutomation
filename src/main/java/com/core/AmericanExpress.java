package com.core;

public class AmericanExpress implements RBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AmericanExpress ae=new AmericanExpress();
ae.carLoan();
ae.personalLoan();
ae.vehicleLoan();
ae.agricultureLoan();

	}
	public void carLoan()
	{
		System.out.println("CarLoan intrst rate 7%");
	}
	public void personalLoan() {
		// TODO Auto-generated method stub
		System.out.println("Persona Loan 12%");
	}
	public void agricultureLoan() {
		// TODO Auto-generated method stub
		System.out.println("agricultur Loan 15%");
	}
	public void vehicleLoan() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle loan 10%");
		
	}

}
