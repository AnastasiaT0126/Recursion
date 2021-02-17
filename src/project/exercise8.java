package project;

public class exercise8 
{
	public static int gcd(int a, int b)
	{
		if(b != 0)
		{
			return gcd(b, a % b);
		}
		return a;
	}
	
	public static int getGcd(int[] a)
	{
		int gcd = a[0];

		for( int i = 1; i < a.length; i++ ) 
		{
			gcd = gcd( gcd, a[i]);
		}
		return gcd; 
	}

	public static void main(String[] args) 
	{
		int[] array = new int[] {64, 8, 512, 8};
		System.out.println(getGcd(array));
	}

}
