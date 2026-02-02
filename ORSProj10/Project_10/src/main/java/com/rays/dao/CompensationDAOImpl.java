package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CompensationDTO;

@Repository
public class CompensationDAOImpl extends BaseDAOImpl<CompensationDTO>  implements CompensationDAOInt{

	@Override
	protected List<Predicate> getWhereClause(CompensationDTO dto, CriteriaBuilder builder,
			Root<CompensationDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPaymentAmount())) {

			whereCondition.add(builder.like(qRoot.get("paymentAmount"), dto.getPaymentAmount() + "%"));
		}

	
		return whereCondition;
	}

	@Override
	public Class<CompensationDTO> getDTOClass() {
		
		return CompensationDTO.class;
	}

}