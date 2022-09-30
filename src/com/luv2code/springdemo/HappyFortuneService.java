package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String [] arr = {"Today is your lucky day!", "Today could be better", "You will get it next time!"}; 
		return arr[(int) (arr.length-(Math.random()*arr.length))]; 
	}

}
