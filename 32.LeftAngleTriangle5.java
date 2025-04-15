// LeftAngleTriangle5

class LeftAngleTriangle5

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=(6-i))
				{
					System.out.print(6-j);
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
	1
   21
  321
 4321
54321
*/