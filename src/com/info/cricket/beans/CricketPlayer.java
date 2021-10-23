package com.info.cricket.beans;

public class CricketPlayer {
	
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
	

   

	public CricketPlayer(String name, Integer age, String role, String city, String contactNumber, Integer strikeRate,
			Integer average, Integer totalRuns, Double economyRate, Integer maidens, Integer totalNumOfWickets) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
		this.city = city;
		this.contactNumber = contactNumber;
		StrikeRate = strikeRate;
		this.average = average;
		this.totalRuns = totalRuns;
		this.economyRate = economyRate;
		this.maidens = maidens;
		this.totalNumOfWickets = totalNumOfWickets;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

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

	public Double getEconomyRate() {
		return economyRate;
	}

	public void setEconomyRate(Double economyRate) {
		this.economyRate = economyRate;
	}

	public Integer getMaidens() {
		return maidens;
	}

	public void setMaidens(Integer maidens) {
		this.maidens = maidens;
	}

	public Integer getTotalNumOfWickets() {
		return totalNumOfWickets;
	}

	public void setTotalNumOfWickets(Integer totalNumOfWickets) {
		this.totalNumOfWickets = totalNumOfWickets;
	}

	@Override
	public String toString() {
		return "CricketPlayer [name=" + name + ", age=" + age + ", role=" + role + ", city=" + city + ", contactNumber="
				+ contactNumber + ", StrikeRate=" + StrikeRate + ", average=" + average + ", totalRuns=" + totalRuns
				+ ", economyRate=" + economyRate + ", maidens=" + maidens + ", totalNumOfWickets=" + totalNumOfWickets
				+ "]";
	}
	
	

}
