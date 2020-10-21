package com.tyingspeed.game;

import java.util.Random;

public class TypingSpeedGame {
	private String[] testingSentences = {"In order to have a complete sentence, the sentence must have a minimum of three word types: a subject, a verb, and an object. In most cases, the subject is a noun or a pronoun.",
								"There are always situations when writers have difficulties getting their words down on paper.",
								"We hope that you have found this sentence tool to be fun and interesting."};
	private int wordPerMin;
	private double accuracyPercent;
	
	public void getTestingSentence() {
		Random random = new Random();
		int randSentence = random.nextInt((testingSentences.length));
		System.out.println(randSentence);
	}
	
	

}
