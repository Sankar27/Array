package Assignment;

public class Sum_Product {

	public static void main(String[] args) 
	{
	
		int [] arr = {1, 2, 3, 4, 5};  
        int sum = 0;  
		 int pro = 1;

       for (int i = 0; i < arr.length; i++) {  
          sum = sum + arr[i];
		   pro = pro * arr[i];
       }  
       System.out.println("Sum of all the elements of an array: " + sum);  
       System.out.println("Product of all the elements of an array: " + pro);  
   

	}

}
