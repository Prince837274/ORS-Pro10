package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PositionDTO;

@Repository
public class PositionDAOImpl extends BaseDAOImpl<PositionDTO> implements PositionDAOInt {

	@Override
	protected List<Predicate> getWhereClause(PositionDTO dto, CriteriaBuilder builder, Root<PositionDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		return whereCondition;
	}

	@Override
	public Class<PositionDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PositionDTO.class;
	}

}
