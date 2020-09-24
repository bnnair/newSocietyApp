package com.society.societymgmt.service;

import java.util.List;

import com.society.societymgmt.model.Deposit;

public interface DepositService {

	public Deposit saveDeposit(Deposit deposit);
	
	public void deleteDeposit(Deposit deposit);
	
	List<Deposit> findByBuildingAndFlatNo(String building, String flatNo);
	
	List<Deposit> findByshopNo(String shopNo);
	
}
