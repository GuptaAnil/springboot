/**
 * 
 */
package com.persey.utility.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author anil
 *
 */
@Entity
@Table(name = "ATTRIBUTES_MASTER")
public class AttributesMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ATT_MASTER_SEQ")
	@SequenceGenerator(sequenceName = "ATT_MASTER_SEQ", allocationSize = 1, name = "ATT_MASTER_SEQ")
	private Long attributesMasterId;
	
	@Column(nullable = false, length = 50)
	private String attributeName;
	
	@Column(length = 500)
	private String attributeDescription;
	
	@Column(nullable = false, length = 50)
	private String attributeDisplayName;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "attributesMaster")
	private Set<Attributes> attributes = new HashSet<Attributes>(); 
	
		
	/**
	 * 
	 */
	public AttributesMaster() {
		super();
	}


	/**
	 * @param attributesMasterId
	 * @param attributeName
	 * @param attributeDescription
	 * @param attributeDisplayName
	 */
	public AttributesMaster(Long attributesMasterId, String attributeName, String attributeDescription,
			String attributeDisplayName) {
		super();
		this.attributesMasterId = attributesMasterId;
		this.attributeName = attributeName;
		this.attributeDescription = attributeDescription;
		this.attributeDisplayName = attributeDisplayName;
	}
	
	
	/**
	 * @return the attributesMasterId
	 */
	public Long getAttributesMasterId() {
		return attributesMasterId;
	}
	/**
	 * @param attributesMasterId the attributesMasterId to set
	 */
	public void setAttributesMasterId(Long attributesMasterId) {
		this.attributesMasterId = attributesMasterId;
	}
	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}
	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	/**
	 * @return the attributeDescription
	 */
	public String getAttributeDescription() {
		return attributeDescription;
	}
	/**
	 * @param attributeDescription the attributeDescription to set
	 */
	public void setAttributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
	}
	/**
	 * @return the attributeDisplayName
	 */
	public String getAttributeDisplayName() {
		return attributeDisplayName;
	}
	/**
	 * @param attributeDisplayName the attributeDisplayName to set
	 */
	public void setAttributeDisplayName(String attributeDisplayName) {
		this.attributeDisplayName = attributeDisplayName;
	}


	/**
	 * @return the attributes
	 */
	public Set<Attributes> getAttributes() {
		return attributes;
	}


	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Set<Attributes> attributes) {
		this.attributes = attributes;
	}

	
	
	

}
