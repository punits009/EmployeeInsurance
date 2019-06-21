package com.cg.service;
import com.cg.bean.*;
import com.cg.exception.InsufficientFundException;


public class AccountService implements Transaction,Gst{

	@Override
	public double calculateTax(double PCT, double amount) {
		// TODO Auto-generated method stub
		
		return amount*Gst.PCT_5;
	}

	@Override
	public double withdraw(Account ob, double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		double new_Balance=ob.getBalance()-amount;
		if(new_Balance<1000)
		{
			new_Balance=ob.getBalance();
			//System.out.println("Insufficient BAlance");
			//throw new RuntimeException("Insufficient Funds Can not process withdrawl");
			throw new InsufficientFundException("Insufficient Funds Can not process withdrawl",new_Balance);
		}
		ob.setBalance(new_Balance);
		
		return new_Balance;
	}

	@Override
	public double deposit(Account ob, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double transfer(Account from, Account to, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
