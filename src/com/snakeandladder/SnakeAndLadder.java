package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Problem");
		
		int position = 0;
		System.out.println("Single player is at postion "+position);
		
		Random random = new Random();
		int dieNum = random.nextInt(7-1)+1;
		
		
	}

}
