package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.EmployeeDTO;

public class EmployeeForm extends BaseForm {
	
	@NotEmpty(message = "please enter name")
	private String name;
	
	@NotEmpty(message = "please enter department")
	private String department;
	
	@NotNull(message = "please enter salary")
	private Long salary;
	
	@NotNull(message = "please enter joiningDate")
	private Date joiningDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	@Override
	public BaseDTO getDto() {
		EmployeeDTO dto = initDTO(new EmployeeDTO());
		dto.setName(name);
		dto.setDepartment(department);
		dto.setSalary(salary);
		dto.setJoiningDate(joiningDate);
		
		return dto;
	}
	

}
