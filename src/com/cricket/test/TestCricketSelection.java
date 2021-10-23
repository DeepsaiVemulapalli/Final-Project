package com.cricket.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.info.cricket.beans.CricketPlayer;
import com.info.cricket.builder.CricketPlayerBuilder;
import com.info.cricket.service.Batsman;
import com.info.cricket.service.Bowler;

class TestCricketSelection {
	Batsman batsman = new Batsman();
	
	Bowler bowler = new Bowler();

	@Test
	void testbatsmanSelect() {
		CricketPlayer player1 = new CricketPlayerBuilder().setName("Rahul").setAge(20).setRole("Batsman")
				.setCity("Chennai").setStrikeRate(100).setTotalRuns(1000).setAverage(40).getPlayer();
		assertTrue(batsman.selectionProcess(player1));
	}
	
	@Test
	void testbatsmanUnSelect() {
		CricketPlayer player2 = new CricketPlayerBuilder().setName("Arun").setAge(21).setRole("Batsman")
				.setCity("Hyderabad").setStrikeRate(60).setTotalRuns(800).setAverage(30).getPlayer();
		assertFalse(batsman.selectionProcess(player2));
	}
	
	@Test
	void testbowlerSelect() {
		CricketPlayer player3 = new CricketPlayerBuilder().setName("Nikhil").setAge(22).setRole("Bowler")
				.setCity("Vizag").setEconomyRate(6.00).setMaidens(10).setTotalNumOfWickets(18).getPlayer();
	
		assertTrue(bowler.selectionProcess(player3));
	}
	
	@Test
	void testbowlerUnSelect() {
		CricketPlayer player4 = new CricketPlayerBuilder().setName("Nikhil").setAge(22).setRole("Bowler")
				.setCity("Vizag").setEconomyRate(6.00).setMaidens(10).setTotalNumOfWickets(0).getPlayer();
	
		assertFalse(bowler.selectionProcess(player4));
	}

}
