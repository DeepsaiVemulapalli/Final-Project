package com.info.cricket.builder;

import com.info.cricket.beans.CricketPlayer;

public class CricketPlayerBuilder {
	
	
	private String name;
	
	private Integer age;
	
	private String role;
	
	private String city;
	
	private String contactNumber;
	
	private Integer StrikeRate;
	
	private Integer average;
	
	private Integer totalRuns;
	
	private Double economyRate;
	
	private Integer maidens;
	
	private Integer totalNumOfWickets;

	public CricketPlayerBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public CricketPlayerBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}

	public CricketPlayerBuilder setRole(String role) {
		this.role = role;
		return this;
	}

	public CricketPlayerBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public CricketPlayerBuilder setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public CricketPlayerBuilder setStrikeRate(Integer strikeRate) {
		StrikeRate = strikeRate;
		return this;
	}

	public CricketPlayerBuilder setAverage(Integer average) {
		this.average = average;
		return this;
	}

	public CricketPlayerBuilder setTotalRuns(Integer totalRuns) {
		this.totalRuns = totalRuns;
		return this;
	}

	public CricketPlayerBuilder setEconomyRate(Double economyRate) {
		this.economyRate = economyRate;
		return this;
	}

	public CricketPlayerBuilder setMaidens(Integer maidens) {
		this.maidens = maidens;
		return this;
	}

	public CricketPlayerBuilder setTotalNumOfWickets(Integer totalNumOfWickets) {
		this.totalNumOfWickets = totalNumOfWickets;
		return this;
	}
	
	public CricketPlayer getPlayer() {
		return new CricketPlayer(name, age, role, city, contactNumber, StrikeRate, average, totalRuns, economyRate, maidens, totalNumOfWickets);
	}
	

}
