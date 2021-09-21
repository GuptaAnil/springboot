/**
 * 
 */
package com.persey.utility.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.persey.utility.container.ContextContainer;
import com.persey.utility.entity.Attributes;
import com.persey.utility.entity.AttributesMaster;
import com.persey.utility.repository.AttributesMasterRepository;
import com.persey.utility.repository.AttributesRepository;
import com.persey.utility.service.AttributesService;
import com.persey.utility.util.SpecificationUtil;







/**
 * @author anil
 *
 */
@Service("attributesServiceImpl")
public class AttributesServiceImpl implements AttributesService {

	@Autowired
	private AttributesMasterRepository attributesMasterRepository;
	
	@Autowired
	private AttributesRepository attributesRepository;
	
	
	SpecificationUtil<Attributes> specifications;
	
	/*@Autowired
	com.persey.rbac.em.repository.AttributesRepository attributesRepository2;
	*/
	public AttributesMaster saveAttributesMaster(AttributesMaster attributesMaster) {
		// TODO Auto-generated method stub
		return attributesMasterRepository.save(attributesMaster);
	}

	public List<AttributesMaster> getAllAttributesMaster() {
		// TODO Auto-generated method stub
		return attributesMasterRepository.findAll();
	}

	public List<Attributes> getAllAttributes(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return attributesRepository.findAll();
	}

	public Attributes saveAttributes(Attributes attributes) {
		// TODO Auto-generated method stub
		return attributesRepository.save(attributes);
	}

	public Page<Attributes> findAllAttributes(ContextContainer contextContainer, String attributeValue) {
		// TODO Auto-generated method stub
		//return attributesRepository.findAllAttributes(pageable);
		
		
		
		//List<ParamDetails> params = RbacUtility.getFilterParamDetails(contextContainer.getFilterContext().getFilter());
		
		//System.out.println("params :: " + params);
		
		
		/*Specification<Attributes> spec = (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();
	        if(attributeValue!=null) {
	            predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("attributesMaster"), 2l)));
	        	// predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("attributeValue"), "%" + attributeValue + "%")));
	        }
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			
		};*/
		specifications = new SpecificationUtil<>();
		
		return attributesRepository.findAll(specifications.getSpecification(contextContainer.getFilterContext()), contextContainer);
	}
	
/*	public List<Attributes> findAllAttributes(String attributeValue) {
		// TODO Auto-generated method stub
		//return attributesRepository.findAllAttributes(pageable);
		
		
		Specification<Attributes> spec = (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();
	        if(attributeValue!=null) {
	            predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("attributeValue"), attributeValue)));
	        }
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			
		};
		
		//attributesRepository.fin
		
		return attributesRepository.findAll(pageable, spec);
	}*/

	@Override
	public List<Attributes> findAllAttributes() {
		// TODO Auto-generated method stub
		return attributesRepository.findAll();
	}

	@Override
	public List<Attributes> findAttributesByAttribuKeys(Set<Long> attributeKeys) {
		// TODO Auto-generated method stub
		
		//return attributesRepository.findAttributesByIds(attributeKeys); // Using @Query -> hibernate query
		//return attributesRepository.findByAttributeKeyIn(attributeKeys);  // Using JPA with parameter name
		return attributesRepository.findAttributesByIdsNative(attributeKeys); //Using Native query
	}
	
	
	/*Specification<Attributes> spec = new Specification<Attributes>() {
		@Override
		public Predicate toPredicate(Root<Attributes> entity, CriteriaQuery<?> query, CriteriaBuilder cb) {                
		    List<Predicate> conditions = buildManyPredicates(cb, entity);
		    return cb.and(conditions.toArray(new Predicate[conditions.size()]));
		}

		public Predicate toPredicate(Root<Attributes> entity, CriteriaQuery<?> query, CriteriaBuilder cb) {
			// TODO Auto-generated method stub
			List<Predicate> conditions = buildManyPredicates(cb, entity);
		    return cb.and(conditions.toArray(new Predicate[conditions.size()]));
		}
		 };*/
	
	
	
	/*Specification<Attributes> spec = new Specification<Employee>() {
        @Override
        public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
            List<Predicate> predicates = new ArrayList<>();
            if(employeeName!=null) {
                predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("employeeName"), employeeName)));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        }*/
	
	
	
	
}


/*class ScificationImpl implements Specification<Attributes> {

	@Override
	public Predicate toPredicate(Root<Attributes> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
*/


