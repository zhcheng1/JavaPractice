// dec--bin: base 1, offset 1; dec--oct: base 7, offset 3
class decBin {
	public static void main(String[] args) {
		trans(60, 1, 1);
	}

	public static void trans(int num, int base, int offset) {
		if(num==0)
		{
			System.out.println("0");		
		}

		char[] table={'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};
		char[] result=new char[32];
		int pos = result.length;

		while (num!=0)
		{
			int num1 = num & base;
			result[--pos] = table[num1];
			num = num >>> offset;
		}
		
		for(int x=pos; x<result.length; x++)
		{
			System.out.print(result[x]);
		}

		System.out.println();
	}
}



