package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;
	public static int count = 0;
	public static Random random = new Random();
	public static int dieNum=0;
	
	public static int diePlay(int position) {
	
		int dieNum = random.nextInt(7-1)+1;
		System.out.println("Dice number : "+dieNum);

		int choice = random.nextInt(4-1)+1;

		if(choice == NO_PLAY){
			System.out.println("No Play");
		}else if(choice == LADDER) {
			System.out.println("Player inclined by "+dieNum);
			position+=dieNum;
			position = diePlay(position);
		}else if(choice == SNAKE) {
			System.out.println("Player declined by "+dieNum);
			position-=dieNum;
		}
		if(position<0)
			position = 0;
		
		if(position>100)
			position-= dieNum;
		
		count++;
		
		return position;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Problem");
		
		int player1Pos = 0;
		int player2Pos = 0;
		
		while(player1Pos != 100 && player2Pos !=100) {
			
			System.out.println("Player 1 is playing");
			player1Pos = diePlay(player1Pos);
			System.out.println("Player 1 position : "+player1Pos);
			
			System.out.println("Player 2 is playing");
			player2Pos = diePlay(player2Pos);
			System.out.println("Player 2 position : "+player2Pos);
			
			
		}
		
		if(player1Pos == 100)
			System.out.println("Player 1 has Won.");
		else
			System.out.println("Player 2 has Won.");
		
		System.out.println("No. of times the die rolled is : "+count);
	}

}
