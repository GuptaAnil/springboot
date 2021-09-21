package com.persey.utility.container;

public class ParamDetails {
	
	private String paramName;
	private String operand;
	private String paramValue;
	
	
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	@Override
	public String toString() {
		return "ParamDetails [paramName=" + paramName + ", operand=" + operand + ", paramValue=" + paramValue + "]";
	}
	
	
	
	

}
