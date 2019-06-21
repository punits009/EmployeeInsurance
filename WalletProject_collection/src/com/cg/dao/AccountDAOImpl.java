package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Account;

public class AccountDAOImpl implements AccountDAO{
	Map<Long,Account> acc=new HashMap<Long,Account>();

	@Override
	public boolean addAccount(Account ob) {
		// TODO Auto-generated method stub
		acc.put(ob.getMobile(), ob);
		return true;
	}

	@Override
	public boolean updateAccount(Account ob) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(Account ob) {
		// TODO Auto-generated method stub
		acc.remove(ob.getAid());
		return false;
	}

	@Override
	public Account findAccount(Long mobileno) {
		// TODO Auto-generated method stub
		Account ob=acc.get(mobileno);
		//System.out.println(ob);
		return ob;
	}

	@Override
	public Map<Long, Account> getallAccount() {
		// TODO Auto-generated method stub
		return acc;
	}
	

}
