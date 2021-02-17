package project;

public class exercise6 {
	public static boolean search(int target, int[] array, int low, int high)
	{
		if(low > high)
	    {
		    return false;		  
	    }
	    
	    else
	    {
		    int mid = (low + high) / 2;
		    
		    if(target == array[mid])
		    {
		    	return true;
		    }
		  
		    else if(target < array[mid])
		    {
			    return search(target, array, low, mid - 1);
		    }
			  
	        else if(target > array[mid])
	        {
	    	    return search(target, array, mid + 1, high);	    	  
	        }
	    }
		return false;
	}

	public static void main(String[] args) 
	{
		System.out.println(search(2, new int[] {1, 2, 4, 8}, 0, 3));//true
		System.out.println(search(5, new int[] {1, 2, 4, 8}, 0, 3));//false
		System.out.println(search(3, new int[] {1, 2, 9, 9}, 0, 3));//false
	}

}
