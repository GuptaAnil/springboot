package com.persey.utility.entity;

import java.util.List;

public class BaseEntity {
	
	private long offset;
	private int limit;
	private boolean last;
	private boolean first;
	private long totalElements;
	private int totalPages;
	private int pageNumber;
	private boolean empty;
	private Object content;
	private List<Link> links;
	
	
	public BaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseEntity(long offset, int limit, boolean last, boolean first, long totalElements,
			int totalPages, boolean empty, Object content, int pageNumber) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.last = last;
		this.first = first;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.pageNumber = pageNumber;
		this.empty = empty;
		this.content = content;
	}
	
	
	public BaseEntity(Object content) {
		super();
		this.content = content;
	}
	
	
	/*public BaseEntity(long offset2, int pageSize, boolean last2, boolean first2, long totalElements2, int totalPages2,
			int number, int numberOfElements2, boolean empty2, List<Attributes> content2) {
		// TODO Auto-generated constructor stub
	}*/
	public long getOffset() {
		return offset;
	}
	public void setOffset(long offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	public boolean isFirst() {
		return first;
	}
	public void setFirst(boolean first) {
		this.first = first;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	
	
	
	
	

}
