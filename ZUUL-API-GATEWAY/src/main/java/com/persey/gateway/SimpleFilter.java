package com.persey.gateway;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class SimpleFilter{
	
	private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);
	

	

	//@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		log.info("inside shouldFilter method::");
		return true;
	}

	//@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		log.info("inside filterOrder method::");
		return 1;
	}

	//@Override
	public String filterType() {
		// TODO Auto-generated method stub
		log.info("inside filterType method::");
		return "pre";		
	}

	
	//@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext ctx = RequestContext.getCurrentContext();
		log.info("inside run method::");
		log.info(String.format("%s request to %s", ctx.getRequest().getMethod(),
					ctx.getRequest().getRequestURL().toString()
				));
		
		return null;
	}
	
}
