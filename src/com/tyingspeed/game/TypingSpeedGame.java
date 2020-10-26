package com.tyingspeed.game;

import java.text.DecimalFormat;
import java.util.Random;

public class TypingSpeedGame {
	
	private String[] testingSentences = { 
			"We cross time zones, which may complicate our medication schedules.\n",
			"There are always situations when writers have difficulties getting their words down on paper.",
			"We hope that you have found this sentence tool to be fun and interesting.",
			"Chain length is the number of words to look back when generating a new word."
			};
	
	private int wordPerMinute;
	private double accuracyPercent;
	private DecimalFormat decimalFormat = new DecimalFormat("#.##");

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
//		System.out.println("TypedWords: \n" + typedSentence);
		System.out.println("WPM: " + wordPerMinute);
	}

	public void calculateAccuracyPercent(String testingSentence, String typedSentence) {
		int matchCount = 0;
		int errorCount = 0;

//		System.out.println("Testing Sentence Length: " + testingSentence.length());
//		System.out.println("Typed Sentence Length: " + typedSentence.length());

		String[] TestingArray = new String[testingSentence.length()];
		String[] TypedArray = new String[typedSentence.length()];

		for (int i = 0; i < testingSentence.length(); i++) {
			TestingArray[i] = Character.toString(testingSentence.charAt(i));
		}
		for (int i = 0; i < typedSentence.length(); i++) {
			TypedArray[i] = Character.toString(typedSentence.charAt(i));
		}

		// Check two string array
		for (int i = 0; i < TypedArray.length; i++) {
//			System.out.println(TypedArray[i] + " = " + TestingArray[i]);
			if (TypedArray[i].equals(TestingArray[i])) {
				matchCount++;
			}else {
				errorCount++;
			}
			
		}
		
		accuracyPercent = ((double)matchCount/(double)TestingArray.length)*100;

		System.out.println("Match Count: " + matchCount);
		System.out.println("Error Count: "+errorCount);
		System.out.println("Accuracy Percent: "+decimalFormat.format(accuracyPercent)+"%");
	}

}
