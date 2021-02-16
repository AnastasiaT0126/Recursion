package project;

public class exercise3 
{
	public static void printFromLeftToRight(int n)
	{
		if(n == 0)
		{
			return;
		}
		else
		{
			printFromLeftToRight(n / 10);
			System.out.println(n % 10);
		}
			
	}

	public static void main(String[] args) 
	{
		printFromLeftToRight(54921);
	}

}
