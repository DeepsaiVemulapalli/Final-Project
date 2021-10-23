package com.info.cricket.service;

import com.info.cricket.beans.CricketPlayer;

public class BatsmanService {

	public boolean selectBatsman(CricketPlayer batsman) {

		if (batsman.getTotalRuns() > 600) {
			if (batsman.getAverage() > 35) {
				if (batsman.getStrikeRate() > 30) {
					return true;
				}
			}
		}
		return false;

	}

}
