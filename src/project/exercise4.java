package project;

public class exercise4 
{
	public static void printFromRightToLeft(int n)
	{
		
		if(n == 0)
		{
			return;
		}
		else
		{
			System.out.println(n % 10);
			printFromRightToLeft(n / 10);
		}
			
	}

	public static void main(String[] args) 
	{
		printFromRightToLeft(82067);
	}

}
