package com.luv2code.springdemo;

public class BasketballCoach implements Coach{
	private FortuneService fortuneService; 
	
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService; 
	}

	@Override
	public String getDailyWorkout() {
		return "Complete 2,000 shots and 20 down-and-backs"; 
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
