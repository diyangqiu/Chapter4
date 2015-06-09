// Diyang Qiu
// May 29th, 2015
// Exercise 6.1


import java.util.Scanner;


public class example6_1 {
	
	
	public static void main(String[] args)
    {
		double sum = 0.0;
		double product = 0.0;
		double average = 0.0;
		double numberone = 0.0;
		double numbertwo = 0.0;
		
		do
		{
			try
			{
				System.out.println("Please enter two numbers.\n");
				Scanner sc = new Scanner(System.in);
				numberone = Double.parseDouble(sc.next());
				numbertwo = Double.parseDouble(sc.next());
			}
			catch (NumberFormatException e)
			{
				System.out.println("\n Error!Invalid Input!\n");
				break;
			}
			
			sum = numberone + numbertwo;
			product = numberone * numbertwo;
			average = sum / 2;		
			
			String messageone = "\n" +
                    "Sum = " + sum + "\nProduct = " + product +"\nAverage: "+ average + "\n";
	
			String messagetwo = "\n" +
					"Sum = " + sum + "*" + "\nProduct = " + product +"\nAverage: "+ average + "\n";
			
			if (sum > 200)
			 System.out.println(messagetwo);
			else 
			 System.out.println(messageone);
		}
		while ( !(numberone == 0 && numbertwo == 0));
		System.out.println("Terminated.\n");
    }
}
