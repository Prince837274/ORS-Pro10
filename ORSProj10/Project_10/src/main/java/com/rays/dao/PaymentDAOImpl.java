package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PaymentDTO;

@Repository
public class PaymentDAOImpl  extends BaseDAOImpl<PaymentDTO> implements PaymentDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PaymentDTO dto, CriteriaBuilder builder, Root<PaymentDTO> qRoot){
	
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPayerName())) {

			whereCondition.add(builder.like(qRoot.get("payerName"), dto.getPayerName() + "%"));
		}

	
		return whereCondition;
	}

	@Override
	public Class<PaymentDTO> getDTOClass() {
		
		return PaymentDTO.class;
	}

}