package com.persy.rbac.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "RBAC_ROLES")
public class RbacRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RBAC_ROLES_SEQ")
	@SequenceGenerator(allocationSize = 1, name = "RBAC_ROLES_SEQ", sequenceName = "RBAC_ROLES_SEQ")
	private Long roleKey;
	
	private String requestKey;
	
	@Column(nullable = false, length = 200)
	private String roleName;
	
	@Column(nullable = false, length = 200)
	private String roleDisplayName;
	
	@Column(nullable = false, length = 500)
	private String roleDescription;
	
	
	private Boolean roleRetrofitFlag;
	
	@Column(nullable = false, length = 40)
	private String roleOwner;
	
	@Column(nullable = false)
	@CreationTimestamp
	private Date roleCreatedOn;
	
	@Column(nullable = false, length = 40)
	private String roleCreatedBy;
	
	@Column(nullable = false)
	@UpdateTimestamp
	private Date roleUpdatedOn;
	
	@Column(nullable = false, length = 40)
	private String roleUpdatedBy;
	
	@Column(nullable = false, length = 40)
	private String roleCreatedByAppUser;
	
	@Column(nullable = false, length = 40)
	private String roleUpdatedByAppUser;
	
	@Column(nullable = false, length = 20)
	private String roleStatus;
	
	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "jobRoles")
	private Set<Applications> applications;*/
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "jobRole")
	private List<RoleToAttribute> roleToAttributes = new LinkedList<RoleToAttribute>();
	
	
	
	
	public Long getRoleKey() {
		return roleKey;
	}
	public void setRoleKey(Long roleKey) {
		this.roleKey = roleKey;
	}
	public String getRequestKey() {
		return requestKey;
	}
	public void setRequestKey(String requestKey) {
		this.requestKey = requestKey;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDisplayName() {
		return roleDisplayName;
	}
	public void setRoleDisplayName(String roleDisplayName) {
		this.roleDisplayName = roleDisplayName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	public String getRoleOwner() {
		return roleOwner;
	}
	public void setRoleOwner(String roleOwner) {
		this.roleOwner = roleOwner;
	}
	public Date getRoleCreatedOn() {
		return roleCreatedOn;
	}
	public void setRoleCreatedOn(Date roleCreatedOn) {
		this.roleCreatedOn = roleCreatedOn;
	}
	public String getRoleCreatedBy() {
		return roleCreatedBy;
	}
	public void setRoleCreatedBy(String roleCreatedBy) {
		this.roleCreatedBy = roleCreatedBy;
	}
	public Date getRoleUpdatedOn() {
		return roleUpdatedOn;
	}
	public void setRoleUpdatedOn(Date roleUpdatedOn) {
		this.roleUpdatedOn = roleUpdatedOn;
	}
	public String getRoleUpdatedBy() {
		return roleUpdatedBy;
	}
	public void setRoleUpdatedBy(String roleUpdatedBy) {
		this.roleUpdatedBy = roleUpdatedBy;
	}
	public String getRoleCreatedByAppUser() {
		return roleCreatedByAppUser;
	}
	public void setRoleCreatedByAppUser(String roleCreatedByAppUser) {
		this.roleCreatedByAppUser = roleCreatedByAppUser;
	}
	public String getRoleUpdatedByAppUser() {
		return roleUpdatedByAppUser;
	}
	public void setRoleUpdatedByAppUser(String roleUpdatedByAppUser) {
		this.roleUpdatedByAppUser = roleUpdatedByAppUser;
	}
	public String getRoleStatus() {
		return roleStatus;
	}
	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}
	public Boolean getRoleRetrofitFlag() {
		return roleRetrofitFlag;
	}
	public void setRoleRetrofitFlag(Boolean roleRetrofitFlag) {
		this.roleRetrofitFlag = roleRetrofitFlag;
	}
	/*public Set<Applications> getApplications() {
		return applications;
	}
	public void setApplications(Set<Applications> applications) {
		this.applications = applications;
	}*/
	
	public List<RoleToAttribute> getRoleToAttributes() {
		return roleToAttributes;
	}
	public void setRoleToAttributes(List<RoleToAttribute> roleToAttributes) {
		this.roleToAttributes = roleToAttributes;
	}
	
	
	
	
	
	

}
