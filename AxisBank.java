package org.system;

public class AxisBank extends Bankinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank abnk = new AxisBank();
		//Overriding//		
		abnk.deposit();
		
		
		abnk.fixed();
		abnk.saving();
		
		
		Bankinfo bnk = new Bankinfo();
		bnk.deposit();

	}
	public void deposit() {
		System.out.println("Axis Bank Deposit");
		
	} 

}
