package project;

import java.util.Scanner;

public class exercise1 
{

	public static int sumOfNumbers(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return n + sumOfNumbers(n - 1);
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 	
		int n = input.nextInt();
		System.out.println("sum = " + sumOfNumbers(n));
		input.close();
	}

}
