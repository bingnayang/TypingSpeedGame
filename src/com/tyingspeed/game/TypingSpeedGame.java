package com.tyingspeed.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		int matchCount = 0;
		int errorCount = 0;
		
		System.out.println("Testing Sentence Length: "+testingSentence.length());
		System.out.println("Typed Sentence Length: "+typedSentence.length());
		
		String[] TestingArray = new String[testingSentence.length()];
		String[] TypedArray = new String[typedSentence.length()];
		for (int i = 0; i < testingSentence.length(); i++) {
			TestingArray[i] = Character.toString(testingSentence.charAt(i));
		}
		for (int i = 0; i < typedSentence.length(); i++) {
			TypedArray[i] = Character.toString(typedSentence.charAt(i));
		}
		
		
		// For testing
		System.out.println("Testing Array:");
		for(int i=0; i<TestingArray.length; i++) {
			System.out.println(i+" : "+TestingArray[i]);
		}
		System.out.println();
		System.out.println("Typed Array:");
		for(int i = 0; i < TypedArray.length; i++) {
			System.out.println(i+" : "+TypedArray[i]);
		}
		
		// Check two string array
		for(int i=0; i<TypedArray.length; i++) {
			for(int j=0; j<TestingArray.length; i++) {
				if(TestingArray[i].equals(TypedArray[i])) {
					matchCount++;
					break;
				}
			}
		}

		
		System.out.println("Match Count: "+matchCount);
//		System.out.println("Error Count: "+errorCount);
		
	}

}
