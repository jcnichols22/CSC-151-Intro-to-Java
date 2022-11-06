import java.util.Scanner;

// A simple class to run the Magpie class.
public class MagpieRunnerJNichols
{

	// Create a Magpie, give it user input, and print its replies.
	public static void main(String[] args)
	{
		MagpieJNichols maggie = new MagpieJNichols();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine().toLowerCase();
		
		
		while (!statement.equals("bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		in.close();
	}
	

}