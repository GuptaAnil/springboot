/**
 * 
 */
package com.persey.utility.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persey.utility.entity.ApplicationRoles;
import com.persey.utility.entity.Applications;
import com.persey.utility.repository.ApplicationRolesRepository;
import com.persey.utility.repository.ApplicationsRepository;
import com.persey.utility.service.ApplicationsService;



/**
 * @author anil
 *
 */
@Service("applicationsServiceImpl")
public class ApplicationsServiceImpl implements ApplicationsService {

	@Autowired
	private ApplicationRolesRepository applicationRolesRepository;
	
	@Autowired
	private ApplicationsRepository applicationsRepository;

	public Applications saveApplications(Applications applications) {
		// TODO Auto-generated method stub
		return applicationsRepository.save(applications);
	}

	public List<Applications> getAllApplications() {
		// TODO Auto-generated method stub
		return applicationsRepository.findAll();
	}

	public List<ApplicationRoles> getAllApplicationRoles() {
		// TODO Auto-generated method stub
		return applicationRolesRepository.findAll();
	}

	public ApplicationRoles saveApplicationRoles(ApplicationRoles applicationRoles) {
		// TODO Auto-generated method stub
		return applicationRolesRepository.save(applicationRoles);
	}
	
	/*@Override
	public AttributesMaster saveAttributesMaster(AttributesMaster attributesMaster) {
		// TODO Auto-generated method stub
		return attributesMasterRepository.save(attributesMaster);
	}

	@Override
	public List<AttributesMaster> getAllAttributesMaster() {
		// TODO Auto-generated method stub
		return attributesMasterRepository.findAll();
	}

	@Override
	public List<Attributes> getAllAttributes() {
		// TODO Auto-generated method stub
		return attributesRepository.findAll();
	}

	@Override
	public Attributes saveAttributes(Attributes attributes) {
		// TODO Auto-generated method stub
		return attributesRepository.save(attributes);
	}
*/
}
