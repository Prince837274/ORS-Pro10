package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "compensation")
public class CompensationDTO extends BaseDTO {

	@Column(name = "staff_Member")
	private String staffMember;

	@Column(name = "payment_Amount")
	private String paymentAmount;

	@Column(name = "data_Applied")
	private Date dateApplied;
	
	private String state;
	

	public String getStaffMember() {
		return staffMember;
	}

	public void setStaffMember(String staffMember) {
		this.staffMember = staffMember;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return staffMember;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "staffMember";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return staffMember;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Staff Member";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		
		return map;
	}

}
