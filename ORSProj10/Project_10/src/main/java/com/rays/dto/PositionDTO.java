package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "position")
public class PositionDTO extends BaseDTO {
	
	private String designation;
	
	@Column(name = "open_date")
	private Date openDate;
	
	@Column(name = "require_exp")
	private int requireExp;
	
	@Column(name = "job_condition")
	private int jobCondition;
	
	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public int getRequireExp() {
		return requireExp;
	}

	public void setRequireExp(int requireExp) {
		this.requireExp = requireExp;
	}
	

	
	public int getJobCondition() {
		return jobCondition;
	}

	public void setJobCondition(int jobCondition) {
		this.jobCondition = jobCondition;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("designation", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("designation", designation);
		return map;

}
}
