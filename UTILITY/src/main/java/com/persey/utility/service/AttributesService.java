/**
 * 
 */
package com.persey.utility.service;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.persey.utility.container.ContextContainer;
import com.persey.utility.entity.Attributes;
import com.persey.utility.entity.AttributesMaster;


/**
 * @author anil
 *
 */
public interface AttributesService {
	
	AttributesMaster saveAttributesMaster(AttributesMaster attributesMaster);
	List<AttributesMaster> getAllAttributesMaster();
	List<Attributes> getAllAttributes(HttpServletRequest request);
	Attributes saveAttributes(Attributes attributes);
	
	Page<Attributes> findAllAttributes(ContextContainer pageable, String attributeValue);
	
	List<Attributes> findAllAttributes();
	
	List<Attributes> findAttributesByAttribuKeys(Set<Long> attributeKeys);

}
