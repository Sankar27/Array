package Assignment;

public class Occurrence {

	public static void main(String[] args) 
	{
		
		int arr[] = new int[]{ 1,2,3,4,2,3,5,2,7,8,9,4,10 };
		int n = arr.length;
		occurrence(arr, n);

	}

	public static void occurrence(int arr[], int n)
	{
		boolean visited[] = new boolean[n];

		for (int i = 0; i < n; i++) {

			if (visited[i] == true)
				continue;
		
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println("Value :" + arr[i] + " " +"Count :" + count);
		}

	}

}
