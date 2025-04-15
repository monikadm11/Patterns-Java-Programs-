// LeftAngleTriangle4

class LeftAngleTriangle4

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=(6-i))
				{
					System.out.print(6-i);
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
   44
  333
 2222
11111
*/