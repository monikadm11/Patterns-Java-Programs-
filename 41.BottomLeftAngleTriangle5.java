// BottomLeftAngleTriangle5

class BottomLeftAngleTriangle5

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
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
54321
 4321
  321
   21
    1
*/