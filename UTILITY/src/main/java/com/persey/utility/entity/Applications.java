/**
 * 
 */
package com.persey.utility.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author anil
 *
 */

@Entity
@Table(name = "APPLICATIONS")
public class Applications {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "APPLICATION_SEQ")
	@SequenceGenerator(allocationSize = 1, name = "APPLICATION_SEQ", sequenceName = "APPLICATION_SEQ" )
	private Long applicationKey;
	
	@Column(nullable = false, length = 100)
	private String applicationName;
	
	@Column(length = 500)
	private String applicationDescriptionName;

	@Column(nullable = false, length = 200)
	private String applicationDisplayName;
	
	@Column(nullable = false, length = 100)
	private String applicationOwner;
	
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "applications")
	private Set<ApplicationRoles> appRoles;
	
	/*@ManyToOne
	@JoinColumn(name = "ROLE_KEY", nullable = false)
	private RbacRoles jobRoles;*/
	
	/**
	 * @return the applicationKey
	 */
	public Long getApplicationKey() {
		return applicationKey;
	}
	/**
	 * @param applicationKey the applicationKey to set
	 */
	public void setApplicationKey(Long applicationKey) {
		this.applicationKey = applicationKey;
	}
	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}
	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	/**
	 * @return the applicationDescriptionName
	 */
	public String getApplicationDescriptionName() {
		return applicationDescriptionName;
	}
	/**
	 * @param applicationDescriptionName the applicationDescriptionName to set
	 */
	public void setApplicationDescriptionName(String applicationDescriptionName) {
		this.applicationDescriptionName = applicationDescriptionName;
	}
	/**
	 * @return the applicationDisplayName
	 */
	public String getApplicationDisplayName() {
		return applicationDisplayName;
	}
	/**
	 * @param applicationDisplayName the applicationDisplayName to set
	 */
	public void setApplicationDisplayName(String applicationDisplayName) {
		this.applicationDisplayName = applicationDisplayName;
	}
	/**
	 * @return the appRoles
	 *//*
	public Set<ApplicationRoles> getAppRoles() {
		return appRoles;
	}
	*//**
	 * @param appRoles the appRoles to set
	 *//*
	public void setAppRoles(Set<ApplicationRoles> appRoles) {
		this.appRoles = appRoles;
	}
	*/
	
	
	
	
	
	
	
	

}
