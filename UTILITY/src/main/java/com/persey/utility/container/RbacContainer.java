package com.persey.utility.container;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class RbacContainer implements Filter {
	
	private static final String RBAC_FILTER_VALUE= "filter";
	private static final String RBAC_SEARCH_VALUE= "search";
	private static final String RBAC_LIMIT_VALUE= "limit";
	private static final String RBAC_OFFSET_VALUE= "offset";
	private static final String RBAC_PAGE_NUMBER_VALUE= "pageNumber";
	private static final String RBAC_SORTBY_VALUE= "sortBy";
	private static final String RBAC_SORT_ORDER_VALUE= "sortOrder";

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
	
		System.out.println("Filter executed " + request.getServerName() + ":" + request.getServerPort() + httpServletRequest.getRequestURI());
		
		
		ContextContainer contextContainer = new ContextContainer();
		
		FilterContext filterContext = new FilterContext();
		String filter = httpServletRequest.getParameter(RBAC_FILTER_VALUE);
		String search = httpServletRequest.getParameter(RBAC_SEARCH_VALUE);
		
		filterContext.setFilter(filter);
		filterContext.setSearch(search);
		
		System.out.println("filter : " + filter + " search : " + search);
		
		contextContainer.setFilterContext(filterContext);
		
		PaginationContext paginationContext = new PaginationContext();
		
		String limit = httpServletRequest.getParameter(RBAC_LIMIT_VALUE);
		String offset = httpServletRequest.getParameter(RBAC_OFFSET_VALUE);	
		String pageNumber = httpServletRequest.getParameter(RBAC_PAGE_NUMBER_VALUE);	
		
		System.out.println("limit : " + limit + " offset : " + offset);
		
		
		if(offset == null) {
			offset = "10";			
		}
		
		if(limit == null) {
			limit = "5";
		}
		
		if(pageNumber == null) {
			pageNumber = "1";
		}
		
		
		paginationContext.setOffset(offset);
		paginationContext.setLimit(limit);
		paginationContext.setPageNumber(Integer.valueOf(pageNumber));
		
		contextContainer.setPaginationContext(paginationContext);
		
		SortingContext sortingContext = new SortingContext();
		
		String sortBy = httpServletRequest.getParameter(RBAC_SORTBY_VALUE);
		String sortOrder = httpServletRequest.getParameter(RBAC_SORT_ORDER_VALUE);
		
		System.out.println("sortBy :: " + sortBy + "  sortOrder :: " + sortOrder);
		sortingContext.setSortBy(sortBy);
		if (sortOrder == null) {
			sortOrder = "ASC";
		}
		sortingContext.setSortOrder(sortOrder);
		
		System.out.println("sortBy : " + sortBy + " sortOrder : " + sortOrder);
		
		contextContainer.setSortingContext(sortingContext);
		
		
		
		
		
		
		
		
		
		
		httpServletRequest.setAttribute("contextContainer", contextContainer);
		
		filterChain.doFilter(request, response);
		
		
		//httpServletRequest.set
		
		
		 /*hsr.getServletContext.getContextPath() gives "/services"
		    hsr.getRequestURI() gives "/services/test"
		    hsr.getRequestURL() gives complete url "http:localhost:8080/services/test"
		    hsr.getQueryString() gives "one=1&two=2"
		    hsr.getServletPath() gives "/test"
		    hsr.getParameterMap() gives all query strings in a Map as key value pair*/
		
		
	}

}
