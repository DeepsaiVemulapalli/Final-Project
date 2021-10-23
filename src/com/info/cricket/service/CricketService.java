package com.info.cricket.service;

import java.util.ArrayList;
import java.util.List;

import com.info.cricket.beans.CricketPlayer;

public class CricketService {

	public static List<CricketPlayer> selectedBatsmanList = new ArrayList<>();
	public static List<CricketPlayer> selectedBowlerList = new ArrayList<>();
	public static List<CricketPlayer> selectedAllrounderList = new ArrayList<>();


	public void processPlayers(List<CricketPlayer> playersList,CricketSelection batsman,	CricketSelection bowler,CricketSelection allrounder ) {
		boolean selected =false;
		for(CricketPlayer player : playersList) {
			if(player.getRole().equals("Batsman")) {
				batsman.registerPlayer(player);
				selected = batsman.selectionProcess(player);
				if(selected) {
					selectedBatsmanList.add(player);
				}
			}
			else if(player.getRole().equals("Bowler")) {
				bowler.registerPlayer(player);
				selected =bowler.selectionProcess(player);
				if(selected) {
					selectedBowlerList.add(player);
				}
			}
			else if(player.getRole().equals("Allrounder")) {
				allrounder.registerPlayer(player);
				selected =allrounder.selectionProcess(player);
				if(selected) {
					selectedAllrounderList.add(player);
				}
			}
		}

		batsman.showSelectedPlayers();
		System.out.println();
		bowler.showSelectedPlayers();
		System.out.println();
		allrounder.showSelectedPlayers();
		System.out.println();
	
	}
		
	}


