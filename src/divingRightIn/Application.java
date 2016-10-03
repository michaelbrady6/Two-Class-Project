package divingRightIn;
import java.util.Scanner;
//this is called a comment
public class Application
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				
				System.out.println("How old are you?");
				Scanner userInputTwo = new Scanner(System.in);
				double age = userInputTwo.nextInt();
				
				System.out.println("What year were you born?");
				
				int year = userInputTwo.nextInt();
				double dogYears = age/7;
				if (age >= 16)
					{
						System.out.println("Hello " + name);
					}
				else
					{
						System.out.println("Hi " + name);
					}
				int ageInYears = 0;
				for(int i = 0; i <= age; i++)
					{
						
						System.out.println("In " + year + " you were " + ageInYears + " years old");
						ageInYears =  ageInYears + 1;
						year = year + 1;
					}
				
				System.out.println("You are " + dogYears + " dog years old");
				System.out.println(name);
				System.out.println(age);
				System.out.println(year);
				int leapYears = year % 4;
			}

	}
