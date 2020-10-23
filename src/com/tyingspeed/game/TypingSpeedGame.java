package com.tyingspeed.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TypingSpeedGame {
	private String[] testingSentences = { "We cross time zones, which may complicate our medication schedules.\n",
			"There are always situations when writers have difficulties getting their words down on paper.",
			"We hope that you have found this sentence tool to be fun and interesting." };
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

		System.out.println("TypedWords: \n" + typedSentence);
		System.out.println("Your WPM is " + wordPerMinute);
	}

	public void calculateAccuracyPercent(String testingSentence, String typedSentence) {
		int matchCount = 0;
		int errorCount = 0;

		System.out.println("Testing Sentence Length: " + testingSentence.length());
		System.out.println("Typed Sentence Length: " + typedSentence.length());

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
			System.out.println(TypedArray[i] + " = " + TestingArray[i]);
			if (TypedArray[i].equals(TestingArray[i])) {
				matchCount++;
			}
		}
		
		double accuracyPercent = ((double)matchCount/(double)TestingArray.length)*100;

		System.out.println("Match Count: " + matchCount);
		System.out.println("TestingArray Length: "+TestingArray.length);
		System.out.println("Accuracy Percent: "+accuracyPercent);
	}

}
