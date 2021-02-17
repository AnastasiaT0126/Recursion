package project;

import java.util.Scanner;

public class exercise7 
{
	public static int gcd(int a, int b)
	{
		if(b != 0)
		{
			return gcd(b, a % b);
		}
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner firstNumber = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = firstNumber.nextInt();
		
		Scanner secondNumber = new Scanner(System.in);
		System.out.println("Enter the second number: ");
		int b = secondNumber.nextInt();
		
		firstNumber.close();
		secondNumber.close();
		
		System.out.println("GCD of the two numbers is: " + gcd(a, b));
	}

}
