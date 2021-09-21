package com.persey.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


//@EnableOAuth2Sso
//@EnableDiscoveryClient
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	/*@GetMapping("/login")
	public String helloWorld(Principal principal) {
		
		System.out.println("hello world");
		
		return "Hi " + principal.getName() + " Welcome to Spring security!";
	}
	*/
	/*@GetMapping("/hello")
	public String helloWorld1() {
		
		System.out.println("hello world");
		
		return "Hi, Welcome to Spring security!";
	}
	*/
	
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

}
