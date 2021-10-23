package com.info.cricket.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.info.cricket.beans.CricketPlayer;
import com.info.cricket.builder.CricketPlayerBuilder;
import com.info.cricket.observer.MsgSendingService;
import com.info.cricket.service.CricketFactory;
import com.info.cricket.service.CricketSelection;
import com.info.cricket.service.CricketService;

public class SelectPlayers {

	public static void main(String[] args) {

		// Builder Patterns to set the inputs
		CricketPlayer player1 = new CricketPlayerBuilder().setName("Rahul").setAge(20).setRole("Batsman")
				.setCity("Chennai").setStrikeRate(100).setTotalRuns(1000).setAverage(40).getPlayer();
		CricketPlayer player2 = new CricketPlayerBuilder().setName("Arun").setAge(21).setRole("Batsman")
				.setCity("Hyderabad").setStrikeRate(60).setTotalRuns(800).setAverage(30).getPlayer();

		CricketPlayer player3 = new CricketPlayerBuilder().setName("Nikhil").setAge(22).setRole("Bowler")
				.setCity("Vizag").setEconomyRate(6.00).setMaidens(10).setTotalNumOfWickets(18).getPlayer();
		CricketPlayer player4 = new CricketPlayerBuilder().setName("Nithin").setAge(20).setRole("Bowler")
				.setCity("kerala").setEconomyRate(5.00).setMaidens(12).setTotalNumOfWickets(20).getPlayer();

		CricketPlayer player5 = new CricketPlayerBuilder().setName("Jithin").setAge(24).setRole("Allrounder")
				.setCity("Pune").setEconomyRate(7.00).setMaidens(5).setTotalNumOfWickets(10).setStrikeRate(70)
				.setTotalRuns(650).setAverage(32).getPlayer();
		CricketPlayer player6 = new CricketPlayerBuilder().setName("Deepan").setAge(20).setRole("Allrounder")
				.setCity("Ranchi").setEconomyRate(7.50).setMaidens(7).setTotalNumOfWickets(11).setStrikeRate(60)
				.setTotalRuns(700).setAverage(35).getPlayer();

		List<CricketPlayer> playersList = Arrays.asList(player1, player2, player3, player4, player5, player6);

		// Factory Patterns to create objects
		CricketFactory cricketFactory = new CricketFactory();
		CricketSelection batsman = cricketFactory.getInstance("Batsman");
		CricketSelection bowler = cricketFactory.getInstance("Bowler");
		CricketSelection allrounder = cricketFactory.getInstance("Allrounder");

		// Register and select the players
		CricketService cricketService = new CricketService();
		cricketService.processPlayers(playersList, batsman, bowler, allrounder);

		List<CricketPlayer> selectedPlayers = new ArrayList<>();
		selectedPlayers.addAll(CricketService.selectedBatsmanList);
		selectedPlayers.addAll(CricketService.selectedBowlerList);
		selectedPlayers.addAll(CricketService.selectedAllrounderList);

		// Observer Pattern to send notification
		System.out.println("=========Notify the Selected Player =============");
		MsgSendingService sendingService = new MsgSendingService();
		sendingService.sendMsg(selectedPlayers);

	}
}
