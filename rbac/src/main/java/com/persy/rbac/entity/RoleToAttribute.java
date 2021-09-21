package com.persy.rbac.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ROLE_ATTRIBUTE")
public class RoleToAttribute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLE_TO_ATT_SEQ")
	@SequenceGenerator(allocationSize = 1, name = "ROLE_TO_ATT_SEQ", sequenceName = "ROLE_TO_ATT_SEQ")
	private Long id;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="roleKey", nullable = false)
	private RbacRoles jobRole;
	
	private Long attributeKey;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RbacRoles getJobRole() {
		return jobRole;
	}

	public void setJobRole(RbacRoles jobRole) {
		this.jobRole = jobRole;
	}

	public Long getAttributeKey() {
		return attributeKey;
	}

	public void setAttributeKey(Long attributeKey) {
		this.attributeKey = attributeKey;
	}
	
	
	
	
	
	
	
	
	
	
	

}
