
public class forLoops
	{

		public static void main(String[] args)
			{
				showGeniusOne();
				showGeniusTwo();
				showGeniusThree();
				showGeniusFour();
				showGeniusFive();
//				showGeniusSix();
//				showGeniusSeven();
//				showGeniusEight();
			}
		
		public static void showGeniusOne()
			{
				for (int i=0; i<5; i++)
					{
						System.out.println(i + 1);
					}
			}
		
		public static void showGeniusTwo()
		{
			for (int i=2; i<=10; i= i+2)
				{
					System.out.println( i + "." + " I love Mullen!");
				}
		}
		
		public static void showGeniusThree()
		{
			for (int i=0; i<5; i++)
				{
					System.out.print(i + 1);
					System.out.println();
				}
		}
		
		public static void showGeniusFour()
		{
			for (int i=10; i>0; i--)
				{
					System.out.println(i);
				}
			System.out.println("Liftoff!");
		}
		
		public static void showGeniusFive()
		{
			for (int i = 5; i<=100; i=i+5)
				{
					int total; 
					total = total + i;
				}
		}
		
	}
