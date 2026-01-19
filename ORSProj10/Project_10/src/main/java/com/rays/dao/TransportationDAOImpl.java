package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TransportationDTO;

@Repository
public class TransportationDAOImpl  extends BaseDAOImpl<TransportationDTO> implements TransportationDAOInt{

	@Override
	protected List<Predicate> getWhereClause(TransportationDTO dto, CriteriaBuilder builder,
			Root<TransportationDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDescription())) {

			whereCondition.add(builder.like(qRoot.get("description"), dto.getDescription() + "%"));
		}

		// TODO Auto-generated method stub
		return whereCondition;
	}

	@Override
	public Class<TransportationDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return TransportationDTO.class;
	}

}
