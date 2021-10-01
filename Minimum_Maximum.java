package Assignment;

public class Minimum_Maximum {

	public static void main(String[] args) 
	{
		
		int arr[] = {27, 93, 45, 10, 33, 100, -5};
		 
	    int max = MaxValue(arr);
	    System.out.println("Maximum Value is: "+max);
	 
	    int min = MinValue(arr);
	    System.out.println("Minimum Value is: "+min);
	}
	 
	    public static int MaxValue(int[] arr){ 
	    int max = arr[0]; 
	    for(int i=1;i < arr.length;i++){ 
	      if(arr[i] > max){ 
	         max = arr[i]; 
	      } 
	    } 
	    return max; 
	  }
	 
	    public static int MinValue(int[] arr){ 
	    int min = arr[0]; 
	    for(int i=1;i < arr.length;i++){ 
	      if(arr[i] < min){ 
	        min = arr[i]; 
	      } 
	    } 
	    return min; 

	}

}
