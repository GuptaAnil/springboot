/**
 * 
 */
package com.persey.utility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persey.utility.entity.ApplicationRoles;




/**
 * @author anil
 *
 */
@Repository("applicationRolesRepository")
public interface ApplicationRolesRepository extends JpaRepository<ApplicationRoles, Long> {

}
