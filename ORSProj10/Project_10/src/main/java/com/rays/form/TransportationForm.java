package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TransportationDTO;

public class TransportationForm  extends BaseForm {
	
	@NotEmpty(message = "please enter description")
	private String description;
	
	@NotNull(message = "please enter mode")
	private Long mode;
	
	@NotNull(message = "please enter bookDate")
	private Date bookDate;
	
	@NotNull(message = "please enter cost")
	private Long cost;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getMode() {
		return mode;
	}

	public void setMode(Long mode) {
		this.mode = mode;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}
	
	@Override
	public BaseDTO getDto() {
		TransportationDTO dto = initDTO(new TransportationDTO());
		dto.setDescription(description);
		dto.setMode(mode);
		dto.setBookDate(bookDate);
		dto.setCost(cost);
		
			
		return dto;
	}
	
	
	

}
