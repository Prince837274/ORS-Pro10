package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CompensationDTO;
import com.rays.dto.PaymentDTO;

public class PaymentForm extends BaseForm {

	@NotEmpty(message = "please enter payerName")
	private String payerName;

	@NotNull(message = "please enter amount")
	private Long amount;

	@NotEmpty(message = "please enter paymentMode")
	private String paymentMode;

	@NotEmpty(message = "please enter paymentStatus ")
	private String paymentStatus;

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public BaseDTO getDto() {
		PaymentDTO dto = initDTO(new PaymentDTO());
		dto.setPayerName(payerName);
		dto.setAmount(amount);
		dto.setPaymentMode(paymentMode);
		dto.setPaymentStatus(paymentStatus);

		return dto;
	}

}
