package com.society.societymgmt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Deposit {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String building;
	private String flatNo;
	private String shopNo;
	
	private double amount;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date depositDate;
	
	private String chequeNo;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date chequeDate;
	
	private String refNo;
	
	private String description;

	public Deposit(int id, String building, String flatNo, double amount, Date depositDate, String description) {
		super();
		this.id = id;
		this.building = building;
		this.flatNo = flatNo;
		this.amount = amount;
		this.depositDate = depositDate;
		this.description = description;
	}

	public String getShopNo() {
		return shopNo;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public Deposit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public Date getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	
	
}
