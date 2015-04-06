//selection sort; pop sort; Array.sort(arr)

class sort1
{
	public static void main(String[] args)
	{
		int[] arr = {14, 356, 34, 6675, 887, 879};
		//selSort(arr);
		popSort(arr);
		print(arr);
	}

	// fix one, compare with the rest
	public static void selSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
				{
					if(arr[x]>arr[y])
					{
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
		}
	}

	// compare in pairs, pop the last max one
	public static void popSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0; y<arr.length-1-x; y++)
				{
					if(arr[y]>arr[y+1])
					{
						int temp = arr[y+1];
						arr[y+1] = arr[y];
						arr[y] = temp;
					}
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
