package com.info.cricket.observer;

public class Players implements Observer{
	
	
	@Override
	public void notifyUser(String msg,String playerName) {
		// TODO Auto-generated method stub
		System.out.println("******"+msg+" "+playerName+" **********");
	}
	
	

}
