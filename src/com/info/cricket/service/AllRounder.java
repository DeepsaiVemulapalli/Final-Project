package com.info.cricket.service;

import java.util.ArrayList;
import java.util.List;

import com.info.cricket.beans.CricketPlayer;

public class AllRounder implements CricketSelection{


	

	@Override
	public void showSelectedPlayers() {
		System.out.println("************List of selected Allrounders *************** ");
		List<CricketPlayer> allrounderList= CricketService.selectedAllrounderList;
		allrounderList.stream().forEach(i->System.out.println(i));
	}



	@Override
	public void registerPlayer(CricketPlayer players) {
		// TODO Auto-generated method stub
		List<CricketPlayer> allrounders = new ArrayList<>();
		allrounders.add(players);
		System.out.println("Player Registered successfully "+players.getName()+" for  Allrounder");
	}

	@Override
	public boolean selectionProcess(CricketPlayer players) {
		// TODO Auto-generated method stub
		AllrounderService allrounderService = new AllrounderService();
		return allrounderService.selectAllrounders(players);
		
	}

}
