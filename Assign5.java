class  Assign5
{
    public static void main(String arg[]) 
    { 
        int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 }; 
        int n = arr.length; 
  
        segregate(arr, n); 
  
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    }
	
	static void segregate(int arr[], int n) 
    { 
        int temp[] = new int[n]; 
        int j = 0; 
          
        for (int i = 0; i < n; i++) 
            if (arr[i] >= 0) 
                temp[j++] = arr[i]; 
   
        if (j == n || j == 0) 
            return; 
		
        for (int i = 0; i < n; i++) 
            if (arr[i] < 0) 
                temp[j++] = arr[i]; 
  
        for (int i = 0; i < n; i++) 
			arr[i] = temp[i]; 
    }  
} 
