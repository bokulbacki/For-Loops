import java.util.Scanner;

public class forLoops
	{
		static Scanner userInput = new Scanner(System.in);
		static int lowNum=0;
		static int highNum=0;
		public static void main(String[] args)
			{
			System.out.println("Comment for homework credit.");
			// comment for homework credit 
				showGeniusOne();
				showGeniusTwo();
				showGeniusThree();
				showGeniusFour();
				showGeniusFive();
				showGeniusSix();
				showGeniusSeven();
				showGeniusEight();
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
			int total=0; 
			for (int i = 5; i<=100; i=i+5)
				{
					total = total + i;
				}
			System.out.println(total);
		}
		
		public static void showGeniusSix()
		{
			System.out.println("Choose a low number.");
			lowNum = userInput.nextInt();
			System.out.println("Choose a high number.");
			highNum = userInput.nextInt();
			int counter = 0;
			for (;lowNum<=highNum; lowNum++)
				{
				 counter = counter + lowNum;
				}
			System.out.println("sum = " +counter);
		}
		
		public static void showGeniusSeven()
		{
			System.out.println("Choose a low number.");
			lowNum = userInput.nextInt();
			System.out.println("Choose a high number.");
			highNum = userInput.nextInt();
			int counter = 0;
			for (;lowNum<=highNum; lowNum++)
				{
				if (lowNum%3==0)
					{
						counter = counter + lowNum;
					}
				else
					{
						
					}
				}
			System.out.println("sum = " +counter);
		}
		
		public static void showGeniusEight()
		{
			System.out.println("*********");
			for (int i = 0; i<9; i++)
				{
					System.out.println("*       *");
				}
			System.out.println("*********");
		}
		
		
		
	}
