package com.info.cricket.service;

import java.util.ArrayList;
import java.util.List;

import com.info.cricket.beans.CricketPlayer;

public class Bowler implements CricketSelection {


	@Override
	public void showSelectedPlayers() {
		System.out.println();
		System.out.println("*************List of selected bowlers***************");
		List<CricketPlayer> bowlerList= CricketService.selectedBowlerList;
		bowlerList.stream().forEach(i->System.out.println(i));
		
	}



	@Override
	public void registerPlayer(CricketPlayer players) {
		// TODO Auto-generated method stub
		List<CricketPlayer> bowlerz = new ArrayList<>();
		bowlerz.add(players);
		System.out.println("Player Registered successfully "+players.getName()+" for  bowler");
	}

	@Override
	public boolean selectionProcess(CricketPlayer players) {
		// TODO Auto-generated method stub
		BowlerService bowlerService = new BowlerService();
		return bowlerService.selectBowler(players);
	}

}
