package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Problem");
		

		int position = 0;
		System.out.println("Single player is at postion "+position);
		
		Random random = new Random();
		int dieNum = random.nextInt(7-1)+1;
		System.out.println("Dice number : "+dieNum);
		
		int choice = random.nextInt(4-1)+1;
		
		if(choice == NO_PLAY){
			System.out.println("No Play");
		}else if(choice == LADDER) {
			System.out.println("Player inclined by "+dieNum);
			position+=dieNum;
		}else if(choice == SNAKE) {
			System.out.println("Player declined by "+dieNum);
			position-=dieNum;
		}
			
	}

}
