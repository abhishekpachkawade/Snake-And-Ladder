package com.company;

import java.util.concurrent.ThreadLocalRandom;

// The SnakeLadderProblem implements an application that
// displays initial position of player 1 in the game
//Rolls a dice and gives random number between 1 to 6
//Then player checks for options whether its no play,ladder or snake and perform actions
//Dice Number Rolled till winning position 100 is reached
//Ensures that winning position not exceeds greater than 100
//Reports the total dice count and position of player each time it rolls a dic

public class SnakeLadderProblem {

	public static void main(String[] args) {
		System.out.println("Wellcome to Snake and Ladder Game");
		// Player position at start
		int startPosition = 0;
		int currentPosition = 0;
		int winningPosition = 100;
		int totalDiceCount = 0;
		int noPlay = 0;
		int ladder = 1;
		int snake = 2;
		System.out.println("The initial position of a player is : " + startPosition);

		while (currentPosition <= winningPosition) {
			int diceNumber = randomDiceNumber();
			int nextMove = nextMove();
			// storing the count of dice roll
			totalDiceCount++;
			System.out.println("Random dice number generated is : " + diceNumber);
			// The Player Checks for option whether its no play,ladder or snake and perform
			if (nextMove == noPlay) {
				System.out.println("Sorry you can not Play,You are at the Same Position");
			} else if (nextMove == ladder) {
				System.out.println("CONGRATS!!! You have got the ladder");
				currentPosition = currentPosition + diceNumber;
			} else if (nextMove == snake) {
				System.out.println("OOPS!!! ITS a SNAKE");
				if (currentPosition < 0) {
					currentPosition = 0;
				}
			}
			// printed in the loop to get count each time
			if (currentPosition > winningPosition) {
				currentPosition = currentPosition - diceNumber;
			} else if (currentPosition == winningPosition) {
				System.out.println("The current position of a player is: " + currentPosition);
				break;
			}
			System.out.println("The current position of a player is: " + currentPosition);

		}
		System.out.println("The total number of times dice was rolled is : " + totalDiceCount);
	}

	static int randomDiceNumber() {
		// dice value is between 1 to 6
		int minDiceValue = 1;
		int maxDiceValue = 6;
		// nextInt is exclusive of top value so added plus 1
		return ThreadLocalRandom.current().nextInt(minDiceValue, maxDiceValue + 1);
	}

	static int nextMove() {
		// generating random numbers 0,1,2 for no play,ladder,snake
		return (int) (Math.floor(Math.random() * 10)) % 3;
	}

}
