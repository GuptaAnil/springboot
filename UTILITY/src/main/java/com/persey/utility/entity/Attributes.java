/**
 * 
 */

package com.persey.utility.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author anil
 * 
 */
@Entity
@Table(name = "ATTRIBUTES")
public class Attributes {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "ATTRIBUTES_SEQ")
	@SequenceGenerator(sequenceName = "ATTRIBUTES_SEQ", allocationSize = 1, name = "ATTRIBUTES_SEQ")
	private Long attributeKey;	
	
	@Column(nullable = false, length = 4000)
	private String attributeValue;
	
	
	@ManyToOne
	@JoinColumn(name = "ATTRIBUTES_MASTER_ID", nullable = false)
	@JsonBackReference
	private AttributesMaster attributesMaster;
		
	
	/**
	 * @return the attributeKey
	 */
	public Long getAttributeKey() {
		return attributeKey;
	}
	/**
	 * @param attributeKey the attributeKey to set
	 */
	public void setAttributeKey(Long attributeKey) {
		this.attributeKey = attributeKey;
	}
	
	/**
	 * @return the attributeValue
	 */
	public String getAttributeValue() {
		return attributeValue;
	}
	/**
	 * @param attributeValue the attributeValue to set
	 */
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
	public AttributesMaster getAttributesMaster() {
		return attributesMaster;
	}
	
	//Went to infinite loop add @JsonIgnore so that it can not set attribute master data when call for attributes 
	//and again attribue master can not set attributes on setter of attributes
	public void setAttributesMaster(AttributesMaster attributesMaster) {
		this.attributesMaster = attributesMaster;
	}
	
	
	
	
	

}
