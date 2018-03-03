package com.mw.model;

public class Result {

	private String description;
	private Double result;

	public Result() {
	}

	public Result(String description, Double result) {
		
		this.description = description;
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

}
