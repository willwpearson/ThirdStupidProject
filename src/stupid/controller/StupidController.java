package stupid.controller;

import java.util.Scanner;


public class StupidController
{
	private String [] words;
	private int [] numbers;
	
	public void start()
	{
		//System.out.println("Ayyy Lmao");
	
		//testScanner();
		
		practiceArray();
	}

//	private void testScanner()
//	{
//		Scanner firstScanner;
//		firstScanner = new Scanner(System.in);
//		System.out.println("What is your favorite food?");
//		String answer = firstScanner.nextLine();
//		System.out.println("Oh cool, you like " + answer );
//		
//	}
	
	private void practiceArray()
	{
		System.out.println(words);
		System.out.println(numbers);
		
		words = new String[4];
		words[0] = "Hi, ";
		words[1] = "How ";
		words[2] = "are ";
		words[3] = "you?";
		for (String current : words)
		{
			System.out.println(current);
		}
		
		numbers = new int[10];
		for(int index = 0; index < 10; index ++)
		{
			numbers[index] = index;
			
			System.out.println(numbers[index]);
		}
	}
}
