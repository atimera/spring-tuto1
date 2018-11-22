package com.amdiatou.springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// no argument constructor
	public TrackCoach() {}
	
	// define constructor for dependency injection
	public TrackCoach(FortuneService pFortuneService) {
		fortuneService = pFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Just Do It: "+ fortuneService.getFortune();
	}

}
