package com.amdiatou.springdemo;

public class SoccerCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// no argument constructor
	public SoccerCoach() {}
	
	// define constructor for dependency injection
	public SoccerCoach(FortuneService pFortuneService) {
		fortuneService = pFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Faire 5 tours de terrain et faire des étirements.";
	}
	
	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "La chance ? " + fortuneService.getFortune();
	}

}
