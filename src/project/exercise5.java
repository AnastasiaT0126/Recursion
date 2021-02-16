package project;

public class exercise5 
{
	private static final int K = 1;
	
	public static void solve(int n, int k)
	{
		int base = 10;
				
		if(k == 0)
		{
			return;
		}
		
		if(n > k)
		{
			System.out.println((int) Math.pow(base, k));
			solve(n, k + 1);
		}
		
		if(n == k)
		{
			System.out.println((int) Math.pow(base, k));
		}
		
		if((int) Math.pow(base, k - 1) != 1)
		{
			System.out.println((int) Math.pow(base, k - 1));
		}
	}

	public static void main(String[] args) 
	{ 
		solve(5, K);
	}

}
