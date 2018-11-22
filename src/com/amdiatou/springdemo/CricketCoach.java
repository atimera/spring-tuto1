package com.amdiatou.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add fields for email and team
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String email) {
		System.out.println("Inside Cricket setter method - setEmailAddress");
		this.emailAddress = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside Cricket setter method - setTeam");
		this.team = team;
	}

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
