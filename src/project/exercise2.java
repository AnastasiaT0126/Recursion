package project;

import java.util.Scanner;

public class exercise2 
{
	public static int sumOfDigits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return n % 10 + sumOfDigits(n / 10);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 	
		int n = input.nextInt();
		System.out.println("Sum of digits --> " + sumOfDigits(n));
		input.close();
	}

}
