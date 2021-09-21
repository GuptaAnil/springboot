/**
 * 
 */
package com.persey.utility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.persey.utility.entity.Applications;
import com.persey.utility.service.ApplicationsService;


/**
 * @author anil
 *
 */
@RestController
@RequestMapping("/applications")
public class ApplicationsController {
	
	@Autowired
	ApplicationsService applicationsServiceImpl;

	@GetMapping
	public ResponseEntity<List<Applications>> getAllApplications(){
		return new ResponseEntity<List<Applications>>(applicationsServiceImpl.getAllApplications(), HttpStatus.OK);
	}
	
	@GetMapping("/check-duplicate")
	public ResponseEntity<String> checkDuplicateRoleName(){
		System.out.println("checking role already exists...");
		return new ResponseEntity<String>("Checking role in applications", HttpStatus.OK);
	}
	
	@GetMapping("/check-duplicate/{roleName}")
	public ResponseEntity<String> checkDuplicateRoleName2(@PathVariable("roleName") String roleName, 
			@RequestParam("username") String username
	){
		System.out.println("checking role already exists..." + roleName);
		return new ResponseEntity<String>("Checking role in applications with rolename :: " + roleName +" and username  " + username , HttpStatus.OK);
	}
	
	

}
