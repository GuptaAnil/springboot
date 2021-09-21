/**
 * 
 */
package com.persey.utility.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persey.utility.container.ContextContainer;
import com.persey.utility.entity.Attributes;
import com.persey.utility.entity.AttributesMaster;
import com.persey.utility.entity.BaseEntity;
import com.persey.utility.service.AttributesService;


/**
 * @author anil
 *
 */

@RestController
@RequestMapping(value="/attributes")
public class AttributesController {
	
	//private static Logger logger = 
	
	@Autowired
	AttributesService attributesServiceImpl;
	
	private ContextContainer contextContainer = null;
	
	/*@GetMapping("/attributes-master")
	public ResponseEntity<List<AttributesMaster>> getAttributeMaster(){
		
		return attributesServiceImpl.getAllAttributesMaster().size() > 0 ? 
				new ResponseEntity<List<AttributesMaster>>(attributesServiceImpl.getAllAttributesMaster(), HttpStatus.OK) : 
					new ResponseEntity<List<AttributesMaster>>(attributesServiceImpl.getAllAttributesMaster(), HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/attributes-master")
	public ResponseEntity<HttpStatus> saveAttributesMaster(@RequestBody AttributesMaster attributesMaster){
		System.out.println("Attribute Name :: " + attributesMaster.getAttributeName());
		AttributesMaster attributesMaster1 = attributesServiceImpl.saveAttributesMaster(attributesMaster);
		return attributesMaster1 != null ? new ResponseEntity<HttpStatus>(HttpStatus.CREATED) : new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping
	public BaseEntity getAllAttributes(HttpServletRequest request){
		
		contextContainer = (ContextContainer) request.getAttribute("contextContainer");
		if(contextContainer != null) {
			//System.out.println("get All attributes  ::  " + contextContainer.getFilterContext().getFilter());
		}
		return attributesServiceImpl.getAllAttributes(HttpServletRequest request).size() > 0
				? new ResponseEntity<List<Attributes>>(attributesServiceImpl.getAllAttributes(), HttpStatus.OK) :
					new ResponseEntity<List<Attributes>>(attributesServiceImpl.getAllAttributes(), HttpStatus.NO_CONTENT);
		
		//List<Attributes> attributList = attributesServiceImpl.getAllAttributes(request);
		
		
		
		Page<Attributes> attributList = attributesServiceImpl.findAllAttributes(contextContainer, "code1");
		
		//List<Attributes> attributList = attributesServiceImpl.findAllAttributes();
		
		
		System.out.println("has prev1 : " + attributList.hasPrevious());
		System.out.println("has next : " + attributList.hasNext());
		
		System.out.println("has isFirst : " + attributList.isFirst());
		System.out.println("has isLast : " + attributList.isLast());
		System.out.println("has getNumber : " + attributList.getNumber());
		
		System.out.println("has getSize : " + attributList.getSize());
		System.out.println("has getNumberOfElements : " + attributList.getNumberOfElements());
		System.out.println("has getTotalElements : " + attributList.getTotalElements());
		System.out.println("has getTotalPages : " + attributList.getTotalPages());
		
		//BaseEntity baseEntity = new BaseEntity();
		//baseEntity.setContent(attributList);
		
		BaseEntity baseEntity = new BaseEntity(attributList.getPageable().getOffset(), 
				attributList.getPageable().getPageSize(), attributList.isLast(), attributList.isFirst(),
				attributList.getTotalElements(), attributList.getTotalPages(), 
				attributList.isEmpty(), attributList.getContent(),
				attributList.getNumber()
				);
		
		System.out.println("attributList.getPageable().previousOrFirst() :: " + attributList.getPageable().previousOrFirst());
		
		
		//BaseEntity baseEntity = new BaseEntity(attributList);
		
		
		return baseEntity;
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> saveAttributes(@RequestBody Attributes attributes){
		System.out.println("Attribute Name :: " + attributes.getAttributeValue());
		Attributes attributes1 = attributesServiceImpl.saveAttributes(attributes);
		return attributes1 != null ? new ResponseEntity<HttpStatus>(HttpStatus.CREATED) : new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/byAttributeKeys")
	public ResponseEntity<List<Attributes>> getAttributeByAttributeKeys(@RequestBody Set<Long> attributeKeys) {
		List<Attributes> attributes = attributesServiceImpl.findAttributesByAttribuKeys(attributeKeys);
		return new ResponseEntity<List<Attributes>>(attributes, HttpStatus.OK);
	}
*/
	
	
	@GetMapping
	public List<Attributes> getAttributes() {
		System.out.println("findAllAttributes controller");
		return attributesServiceImpl.findAllAttributes();
	}
	
	
	
	

}
