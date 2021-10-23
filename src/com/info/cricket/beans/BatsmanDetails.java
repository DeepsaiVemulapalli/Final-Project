package com.info.cricket.beans;

public class BatsmanDetails {
	
	private String name;
	
	private Integer StrikeRate;
	
	private Integer average;
	
	private Integer totalRuns;
	
	private Integer noOfMatches;
	
	

	

	public Integer getStrikeRate() {
		return StrikeRate;
	}

	public void setStrikeRate(Integer strikeRate) {
		StrikeRate = strikeRate;
	}

	public Integer getAverage() {
		return average;
	}

	public void setAverage(Integer average) {
		this.average = average;
	}

	public Integer getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(Integer totalRuns) {
		this.totalRuns = totalRuns;
	}

	public Integer getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(Integer noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
