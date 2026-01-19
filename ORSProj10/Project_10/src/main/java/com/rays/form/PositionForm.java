package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PositionDTO;
import com.rays.dto.TransportationDTO;

public class PositionForm extends BaseForm {
	
	@NotEmpty(message = " please enter designation")
	private String designation;
	
	@NotNull(message = "please enter openDate")
	private Date openDate;
	
	@NotNull(message = "please enter requireExp")
	private Integer requireExp;
	
	@NotNull(message = "please enter jobcondition")
	private Integer jobCondition;

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

	public void setRequireExp(Integer requireExp) {
		this.requireExp = requireExp;
	}
	

	
	public int getJobCondition() {
		return jobCondition;
	}

	public void setJobCondition(Integer jobCondition) {
		this.jobCondition = jobCondition;
	}

	@Override
	public BaseDTO getDto() {
		PositionDTO dto = initDTO(new PositionDTO());
		dto.setDesignation(designation);
		dto.setOpenDate(openDate);;
		dto.setRequireExp(requireExp);;
		dto.setJobCondition(jobCondition);
		
		return dto;
		}
}
