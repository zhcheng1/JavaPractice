//better space efficiency

class sort2
{
	public static void main(String[] args)
	{
		int[] arr = {14, 356, 34, 6675, 887, 879};
		selSort(arr);
		print(arr);
	}

	// introduce two temp vars, do one swap at a time
	public static void selSort(int[] arr)
	{		
		for(int x=0; x<arr.length-1; x++)
		{
			int num = arr[x], index=x;
			for(int y=x+1; y<arr.length; y++)
				{
					if(arr[x]>arr[y])
					{
						num = arr[y];
						index = y;
					}
				}
			if(index!=x)
			{
				int temp = arr[x];
				arr[x] = arr[index];
				arr[index] = temp;
			}
		}
	}

	public static void print(int[] arr)
	{
		for(int i=0; i<arr.length; i++)		
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}
