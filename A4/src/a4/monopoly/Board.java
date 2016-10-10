package a4.monopoly;

import java.util.Random;

public class Board {
	private Property locations[] = new Property [40];
	private Random random;
	
	
	public int [] rollDice(){
		int die1 = random.nextInt(5)+1;
		int die2 = random.nextInt(5)+1;
		int [] roll = {die1, die2};
		return roll;
	}
}
