package com.tyingspeed.game;

import java.util.Random;

public class TypingSpeedGame {
	private String[] testingSentences = {"In order to have a complete sentence, the sentence must have a minimum of three word types: a subject, a verb, and an object.",
								"There are always situations when writers have difficulties getting their words down on paper.",
								"We hope that you have found this sentence tool to be fun and interesting."};
	private int wordPerMinute;
	private double accuracyPercent;
	
	public String getTestingSentence() {
		Random random = new Random();
		int randSentence = random.nextInt((testingSentences.length));
		System.out.println(randSentence);
		return testingSentences[randSentence];
	}
	
	public void getWordPerMinute(double startTime, double endTime) {
		double elapsedTime = endTime - startTime;
		double seconds = elapsedTime / 1000000000.0;

		System.out.println("ElapsedTime Start: "+startTime);
		System.out.println("ElapsedTime End: "+endTime);
		System.out.println("ElapsedTime: "+elapsedTime);
		System.out.println("Second: "+seconds);

	}
	

}
