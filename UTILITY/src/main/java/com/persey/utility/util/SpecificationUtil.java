package com.persey.utility.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.persey.utility.container.FilterContext;
import com.persey.utility.container.ParamDetails;




public class SpecificationUtil<T> {
	
	public Specification<T> getSpecification(FilterContext filterContext) {
		
		System.out.println("spec ends::");
		
		Specification<T> spec = (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();

			LinkedList<ParamDetails> paramDetailsList = null;
			
			if(filterContext.getFilter() != null) {
				paramDetailsList = UtilityUtils.getParamDetails(filterContext.getFilter());
				
				paramDetailsList.forEach((paramDetails) -> {
					System.out.println("abc1");
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get(paramDetails.getParamName()), Long.valueOf(paramDetails.getParamValue()))));
				});
			}
			
			if(filterContext.getSearch() != null) {
				System.out.println("abc2");
				paramDetailsList = UtilityUtils.getParamDetails(filterContext.getSearch());
				
				paramDetailsList.forEach((paramDetails) -> {
					if(paramDetails.getOperand().equalsIgnoreCase("cn")) {
						System.out.println("contains");
						predicates.add(criteriaBuilder.and(criteriaBuilder.like(criteriaBuilder.lower(root.get(paramDetails.getParamName())), "%" + paramDetails.getParamValue().toLowerCase() + "%")));
					} else if(paramDetails.getOperand().equalsIgnoreCase("sw")) {
						System.out.println("starts with");
						predicates.add(criteriaBuilder.and(criteriaBuilder.like(criteriaBuilder.lower(root.get(paramDetails.getParamName())), paramDetails.getParamValue().toLowerCase() + "%")));
					}else if(paramDetails.getOperand().equalsIgnoreCase("ew")) {
						System.out.println("ends with");
						predicates.add(criteriaBuilder.and(criteriaBuilder.like(criteriaBuilder.lower(root.get(paramDetails.getParamName())), "%" + paramDetails.getParamValue().toLowerCase())));
					}else {
						System.out.println("equals");
						predicates.add(criteriaBuilder.and(criteriaBuilder.equal(criteriaBuilder.lower(root.get(paramDetails.getParamName())), paramDetails.getParamValue().toLowerCase())));
					}
				});
			}
			
			System.out.println("predicates.size() :: " + predicates.size());
			
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			
		};
		
		System.out.println("spec ends::");
		
		return spec;
		
		
	}

}
