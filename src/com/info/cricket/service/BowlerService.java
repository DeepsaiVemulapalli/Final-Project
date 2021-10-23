package com.info.cricket.service;

import com.info.cricket.beans.CricketPlayer;

public class BowlerService {
	
	
	public boolean selectBowler(CricketPlayer bowler) {

		if (bowler.getTotalNumOfWickets() > 15) {
			if (bowler.getEconomyRate() < 8.00) {
				if (bowler.getMaidens() > 5) {
					return true;
				}
			}
		}
		return false;

	}

}
