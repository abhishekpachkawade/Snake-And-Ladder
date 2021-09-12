package com.company;

import java.util.concurrent.ThreadLocalRandom;

// The SnakeLadderProblem implements an application that
// displays initial position of player 1 in the game
//Rolls a dice and gives random number between 1 to 6

public class SnakeLadderProblem {

	public static void main(String[] args) {
		System.out.println("Wellcome to Snake and Ladder Game");
		// Player position at start
		int startPosition = 0;
		//dice value is between 1 to 6
		int minDiceValue = 1;
		int maxDiceValue = 6;
		//nextInt is exclusive of top value so added plus 1
		int randomNum = ThreadLocalRandom.current().nextInt(minDiceValue,maxDiceValue +1);
		System.out.println("The initial position of a player is : " + startPosition);
        System.out.println("After rolling a die position of player is at : "+randomNum);

	}
	
}
