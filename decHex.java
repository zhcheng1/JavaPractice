//bin to hex: 4 digits & 1111, get the last four digits

class decHex {
	public static void main(String[] args) {
		toHex(60);
		toHex_Array(60);
		toHex_Array_2(60);
	}


	public static void toHex(int num) {
		for (int i=0; i<8; i++) 
		{
			int num1 = num & 15;
			if(num1>9)
				System.out.print((char)(num1-10+'A'));
			else
				System.out.print(num1);
			num = num >>> 4;
		}
		System.out.println();
	}

	public static void toHex_Array(int num) {
		char[] table={'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};
		for (int i=0; i<8; i++) 
		{
			int num1 = num & 15;
			System.out.print(table[num1]);
			num = num >>> 4;
		}
		System.out.println();
	}

	public static void toHex_Array_2(int num) {
		if(num==0)
		{
			System.out.println("0");		
		}

		char[] table={'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};
		char[] result=new char[8];
		int pos = result.length;

		// pos = 8; --pos=7
		while (num!=0)
		{
			int num1 = num & 15;
			result[--pos] = table[num1];
			num = num >>> 4;
		}
		
		// pos is the position with valid data
		for(int x=pos; x<result.length; x++)
		{
			System.out.print(result[x]);
		}

		System.out.println();
	}
}



