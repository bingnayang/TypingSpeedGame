package com.tyingspeed.game;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TypingSpeedGame game = new TypingSpeedGame();
		String testingSentence = game.getTestingSentence();
		System.out.println(testingSentence);
		
		double startTime = LocalTime.now().toNanoOfDay();
		
		Scanner scanner = new Scanner(System.in);
		String typedSentence = scanner.nextLine();
		
		double endTime = LocalTime.now().toNanoOfDay();
		game.calculateWordPerMinute(startTime,endTime,typedSentence);
		game.calculateAccuracyPercent(testingSentence,typedSentence);
	}

}
