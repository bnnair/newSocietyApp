package com.society.societymgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.society.societymgmt.model.Deposit;
import com.society.societymgmt.repositories.DepositRepository;
import com.society.societymgmt.service.DepositService;

public class DepositServiceImpl implements DepositService {

	@Autowired
	private DepositRepository depositRepository;
	
	@Override
	public Deposit saveDeposit(Deposit deposit) {
		// TODO Auto-generated method stub
		return depositRepository.save(deposit);
	}

	@Override
	public void deleteDeposit(Deposit deposit) {
		// TODO Auto-generated method stub
		depositRepository.delete(deposit);
	}

	@Override
	public List<Deposit> findByBuildingAndFlatNo(String building, String flatNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deposit> findByshopNo(String shopNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
