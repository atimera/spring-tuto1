package com.amdiatou.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	private String[] data = {
			"You are in a Bad mood today!",
			"You are easily Angry today!",
			"Today is your lucky day!",
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune =  data[index];
		return theFortune;
	}

}
