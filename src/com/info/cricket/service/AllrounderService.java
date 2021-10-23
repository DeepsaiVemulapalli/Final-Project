package com.info.cricket.service;

import com.info.cricket.beans.CricketPlayer;

public class AllrounderService {

	public boolean selectAllrounders(CricketPlayer allrounder) {

		if (allrounder.getTotalRuns() > 200) {
			if (allrounder.getAverage() > 25) {
				if (allrounder.getStrikeRate() > 30) {
					if (allrounder.getTotalNumOfWickets() > 8) {
						if (allrounder.getMaidens() > 4) {
							if (allrounder.getEconomyRate() > 4.00) {
								return true;
							}
						}
					}

				}
			}
		}
		return false;

	}

}
