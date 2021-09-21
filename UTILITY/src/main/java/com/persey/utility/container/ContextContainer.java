package com.persey.utility.container;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class ContextContainer implements Pageable {
	
	
	private FilterContext filterContext;
	//@JsonIgnore
	private PaginationContext paginationContext;
	//@JsonIgnore
	private SortingContext sortingContext;
	
	public ContextContainer() {
		
	}
	
	
	public FilterContext getFilterContext() {
		return filterContext;
	}
	public void setFilterContext(FilterContext filterContext) {
		this.filterContext = filterContext;
	}
	
	public PaginationContext getPaginationContext() {
		return paginationContext;
	}
	public void setPaginationContext(PaginationContext paginationContext) {
		this.paginationContext = paginationContext;
	}
	
	public SortingContext getSortingContext() {
		return sortingContext;
	}
	public void setSortingContext(SortingContext sortingContext) {
		this.sortingContext = sortingContext;
	}
	
	
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}
	public long getOffset() {
		// TODO Auto-generated method stub
		return Long.valueOf(this.paginationContext.getOffset());
	}
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return this.paginationContext.getPageNumber();
	}
	public int getPageSize() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.paginationContext.getLimit());
	}
	
	
	public Sort getSort() {
		// TODO Auto-generated method stub
		Sort.Direction direction = Direction.ASC;;
		if(this.sortingContext != null) {
			if(this.sortingContext.getSortOrder().equalsIgnoreCase("DESC")) {
			 direction = Direction.DESC;
			}
		}
		
		System.out.println("this.sortingContext.getSortBy() :: " + this.sortingContext.getSortBy());
		
		return Sort.by(direction, this.sortingContext.getSortBy());
	
		//return Sort.unsorted();
	}
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
