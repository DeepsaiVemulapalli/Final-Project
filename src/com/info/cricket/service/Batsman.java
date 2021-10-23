package com.info.cricket.service;

import java.util.ArrayList;
import java.util.List;

import com.info.cricket.beans.CricketPlayer;

public class Batsman implements CricketSelection {


	@Override
	public void showSelectedPlayers() {
		// TODO Auto-generated method stub
		System.out.println("**********List of selected batsman ****************");
		List<CricketPlayer> batsmanList= CricketService.selectedBatsmanList;
		batsmanList.stream().forEach(i->System.out.println(i));
	}


	@Override
	public void registerPlayer(CricketPlayer players) {
		// TODO Auto-generated method stub
		List<CricketPlayer> batsmanList = new ArrayList<>();
		batsmanList.add(players);
		System.out.println("Player Registered successfully "+players.getName()+"  for batsman");
	}

	@Override
	public boolean selectionProcess(CricketPlayer players) {
		// TODO Auto-generated method stub
		BatsmanService batsmanService = new BatsmanService();
		return batsmanService.selectBatsman(players);
	}

}
