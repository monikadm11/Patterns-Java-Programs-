// BottomLeftAngleTriangle9

class BottomLeftAngleTriangle9

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					System.out.print((char)(70-j));
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
EDCBA
 DCBA
  CBA
   BA
    A

*/