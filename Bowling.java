package com.bowlingredo;

public class Bowling {

	public static void main(String[] args) {

		int score = 0;
		int pins = 10;
		int frames = 10;
		int pinsRemaining = 10;
		int pinsKnockedDown = 0;

		int[] tenFrame = new int[10];

		System.out.println("Here are your scores:");

		for (frames = 1; frames <= 10; frames++) {
			pinsKnockedDown = (int) (Math.random() * 11);
			score += pinsKnockedDown;
			pinsRemaining = pins - pinsKnockedDown;
			pinsKnockedDown = (int) (Math.random() * (pinsRemaining + 1));
			score += pinsKnockedDown;

			tenFrame[frames - 1] = score;
			System.out.println(tenFrame[frames - 1]);
		}
		System.out.println("OUCH....Try harder next time you bum!");

	}

}
