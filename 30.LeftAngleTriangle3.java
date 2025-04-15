// LeftAngleTriangle3

class LeftAngleTriangle3

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=(6-i))
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
/*
	5
   45
  345
 2345
12345
*/