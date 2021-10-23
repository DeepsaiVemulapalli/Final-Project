package com.info.cricket.observer;

import java.util.List;

import com.info.cricket.beans.CricketPlayer;

public class MsgSendingService {
	
	Players players = new Players();
	
	public void sendMsg(List<CricketPlayer> playerList) {
		for(CricketPlayer player :playerList) {
			players.notifyUser("Congratulations you have selected to the team ", player.getName());
		}
		
	}

}
