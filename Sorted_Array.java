package Assignment;

public class Sorted_Array {

	public static void main(String[] args) 
	{	
		int[] arr = {1,2,0,7,-3,-4,-5,6};
		int temp = 0;

		System.out.println("Numbers in Array is :");

		for (int i =0; i < arr.length; i++ )
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println("Sorted Array is :");
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
