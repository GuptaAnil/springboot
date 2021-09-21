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


/**
 * @author anil
 *
 */
@Entity
@Table(name = "APPLICATION_ROLES")
public class ApplicationRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APP_ROLES_SEQ")
	@SequenceGenerator(allocationSize = 1, name = "APP_ROLES_SEQ", sequenceName = "APP_ROLES_SEQ")
	private Long applicationRoleKey;
	
	@Column(nullable = false, length = 100)
	private String applicationRoleName;
	
	@Column(length = 200)
	private String applicationRoleDescription;
	
	@Column(nullable = false, length = 200)
	private String applicationRoleDisplayName;
	
	@ManyToOne
	@JoinColumn(name = "APPLICATION_KEY", nullable = false)
	private Applications applications;
	
	/**
	 * @return the applicationRoleKey
	 */
	public Long getApplicationRoleKey() {
		return applicationRoleKey;
	}
	/**
	 * @param applicationRoleKey the applicationRoleKey to set
	 */
	public void setApplicationRoleKey(Long applicationRoleKey) {
		this.applicationRoleKey = applicationRoleKey;
	}
	/**
	 * @return the applicationRoleName
	 */
	public String getApplicationRoleName() {
		return applicationRoleName;
	}
	/**
	 * @param applicationRoleName the applicationRoleName to set
	 */
	public void setApplicationRoleName(String applicationRoleName) {
		this.applicationRoleName = applicationRoleName;
	}
	/**
	 * @return the applicationRoleDescription
	 */
	public String getApplicationRoleDescription() {
		return applicationRoleDescription;
	}
	/**
	 * @param applicationRoleDescription the applicationRoleDescription to set
	 */
	public void setApplicationRoleDescription(String applicationRoleDescription) {
		this.applicationRoleDescription = applicationRoleDescription;
	}
	/**
	 * @return the applicationRoleDisplayName
	 */
	public String getApplicationRoleDisplayName() {
		return applicationRoleDisplayName;
	}
	/**
	 * @param applicationRoleDisplayName the applicationRoleDisplayName to set
	 */
	public void setApplicationRoleDisplayName(String applicationRoleDisplayName) {
		this.applicationRoleDisplayName = applicationRoleDisplayName;
	}
	
	
	
	

}
