/**
 * 
 */
package com.persey.utility.service;

import java.util.List;

import com.persey.utility.entity.ApplicationRoles;
import com.persey.utility.entity.Applications;


/**
 * @author anil
 *
 */
public interface ApplicationsService {
	
	Applications saveApplications(Applications applications);
	List<Applications> getAllApplications();
	List<ApplicationRoles> getAllApplicationRoles();
	ApplicationRoles saveApplicationRoles(ApplicationRoles applicationRoles);

}
