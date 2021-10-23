package com.info.cricket.service;

import java.util.List;

import com.info.cricket.beans.CricketPlayer;

public interface CricketSelection {
	
	
	void registerPlayer(CricketPlayer players);
			
	boolean selectionProcess(CricketPlayer players);
	
	void showSelectedPlayers();
	

}
