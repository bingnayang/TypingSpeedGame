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
	
	public void calculateWordPerMinute(double startTime, double endTime, String typedSentence) {
		double elapsedTime = endTime - startTime;
		double seconds = elapsedTime / 1000000000.0;
		int numChars = typedSentence.length();
		wordPerMinute = (int) ((((double) numChars / 5) / seconds) * 60);
		
		System.out.println("TypedWords: \n"+typedSentence);
		System.out.println("Your WPM is " + wordPerMinute);
	}
	public void calculateAccuracyPercent(String testingSentence, String typedSentence) {
		System.out.println("Testing Sentence Length: "+testingSentence.length());
		System.out.println("Typed Sentence Length: "+typedSentence.length());
	}

}
