package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService; 
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService; 
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K"; 
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune(); 
	}
	
	//init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	//destroy method
	public void doMyCleanStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanStuffYoYo");
	}

}
