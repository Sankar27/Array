package Assignment;

public class Duplicate {

	public static void main(String[] args) 
	{
		 int [] arr = {11,22,55,33,22,77,55,99,44,77,33};   
         
	        System.out.println("Duplicate elements : " );  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
				}
			}

	}

}
