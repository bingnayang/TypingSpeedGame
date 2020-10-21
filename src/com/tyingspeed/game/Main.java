package com.tyingspeed.game;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TypingSpeedGame game = new TypingSpeedGame();
		System.out.println(game.getTestingSentence());
		
		double startTime = LocalTime.now().toNanoOfDay();
		
		Scanner scanner = new Scanner(System.in);
		String typedSentence = scanner.nextLine();
		
		double endTime = LocalTime.now().toNanoOfDay();
		game.getWordPerMinute(startTime,endTime);
				
	}

}
