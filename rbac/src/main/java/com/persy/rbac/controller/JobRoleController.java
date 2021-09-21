package com.persy.rbac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.persy.rbac.vo.AttributesVO;

@RestController
@RequestMapping(value="/roles")
public class JobRoleController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public String welcome() {
		
		System.out.println("Welcome home");
		
		ResponseEntity<List<AttributesVO>> attributeList = restTemplate.exchange("http://UTILITY/attributes", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<AttributesVO>>() {}
				);
		System.out.println("size :: " + attributeList.getBody().size());
		System.out.println(attributeList.getBody().get(0).getAttributeValue());
		return "Welcome to rbac application";
	}

}
