package com.amdiatou.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// a no-arg constructor
	public CricketCoach() {
		System.out.println("Inside Cricket no-arg contructor");
	}
	
	// our setter method for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
