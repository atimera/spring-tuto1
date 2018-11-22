package com.amdiatou.springdemo;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// no argument constructor
	public BaseballCoach() {}
	
	// define constructor for dependency injection
	public BaseballCoach(FortuneService pFortuneService) {
		fortuneService = pFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practices";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
