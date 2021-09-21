/**
 * 
 */
package com.persey.utility.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persey.utility.entity.Attributes;




/**
 * @author anil
 *
 */

@Repository("attributesRepository1")
public interface AttributesRepository extends JpaRepository<Attributes, Long>, JpaSpecificationExecutor<Attributes>{
	
	@Query("SELECT att from Attributes att")
	Page<Attributes> findAllAttributes(Pageable pageable);
	
	@Query("SELECT att FROM Attributes att WHERE att.attributeKey IN (:attributeKeys)")
	List<Attributes> findAttributesByIds(@Param("attributeKeys") Set<Long> attributeKeys);
	
	List<Attributes> findByAttributeKeyIn(Set<Long> attributeKeys);
	
	//@Query(nativeQuery = true, value = "SELECT * FROM ATTRIBUTES att WHERE att.ATTRIBUTE_KEY =:attributeKey")
	@Query(nativeQuery = true, value = "SELECT * FROM ATTRIBUTES att WHERE att.ATTRIBUTE_KEY IN (:attributeKeys)")
	List<Attributes> findAttributesByIdsNative(@Param("attributeKeys") Set<Long> attributeKeys);
		
	

}
