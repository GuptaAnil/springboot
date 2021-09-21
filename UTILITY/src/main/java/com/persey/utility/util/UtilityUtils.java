package com.persey.utility.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.persey.utility.container.ParamDetails;


public class UtilityUtils {
	
public static List<ParamDetails> getSearchParamDetails(String searchValue) {
		
		//String filterValue = filterContext.getFilter();
		
		LinkedList<ParamDetails> paramDetailsList = getParamDetails(searchValue);
		
		return getParamDetails(searchValue);
	}



	public static LinkedList<ParamDetails> getParamDetails(String paramValue) {
		LinkedList<ParamDetails> paramDetailsList = new LinkedList<>();
		
		if(paramValue != null) {
			if(paramValue.contains("and") || paramValue.contains("AND")) {
				List<String> list = Arrays.asList(paramValue.split("and | AND"));
				//Arrays.asList(arr);
				list.forEach((paramDetails) -> {
					if(getParamDetailsObject(paramDetails) != null) {
						paramDetailsList.add(getParamDetailsObject(paramDetails));
					}
				});
				
				System.out.println("list :: " + list);
			} else {
				if(getParamDetailsObject(paramValue) != null) {
					paramDetailsList.add(getParamDetailsObject(paramValue));
				}
			}			
		}
		return paramDetailsList;
	}
	
	
	
	
	
	public static List<ParamDetails> getFilterParamDetails(String filterValue) {
		
		//String filterValue = filterContext.getFilter();
		
		LinkedList<ParamDetails> paramDetailsList = getParamDetails(filterValue);
		
		return getParamDetails(filterValue);
	}
	
	//public 
	
	public static ParamDetails getParamDetailsObject(String filterData) {
		List<String> list = Arrays.asList(filterData.trim().split(" "));
		
		if(list.size() == 3) {
			ParamDetails paramDetails = new ParamDetails();
			paramDetails.setParamName(list.get(0).trim());
			paramDetails.setOperand(list.get(1).trim());
			paramDetails.setParamValue(list.get(2).trim());
			return paramDetails;
		}
		return null;
	}
	


}
