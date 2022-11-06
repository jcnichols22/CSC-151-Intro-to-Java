import java.time.LocalDate;
import java.util.Random;

//A program to carry on conversations with a human user.
 
public class MagpieJNichols
{
	//Get a default greeting
	
	public String getGreeting()
	{
		return "Hey there, What's up?";
	}

	// Gives a response to a user statement

	public String getResponse(String statement)
	{
		// returns if nothing is typed
		String response = "";
		if (statement.length() == 0)
		{
			response = "Will you please say something?";
		}

		else if (statement.contains("date"))
		{
			LocalDate today = LocalDate.now();
			response = today.toString();
		}

		else if (statement.contains("hi")
				|| statement.contains("hey")
				|| statement.contains("hello"))
		{
			response = "Hey There!";
		}

		//Else if statments grabbing keywords using .contains to generate responses based off of those words
		
		// returns if user types no
		else if (statement.contains("no"))
		{
			response = "Well you dont have to be so negative.";
		}

		else if (statement.contains("sorry"))
		{
			response = "It's ok you dont have to be sorry.";
		}
		
		else if (statement.contains("how are you"))
		{
			response = "I'm good, thank you for asking!";
		}

		// returns chatbots name
		else if (statement.contains("your name"))
		{
			response = "My name is Maggie McMagerson, what's youres?";
		}		

		// when asked about the matrix
		else if (statement.contains("matrix"))
		{
			response = "Do you think I would really tell you......";
		}

		else if (statement.contains("gender"))
		{
			response = "I am genderless, like cacti, and certain species of fish";
		}

		else if (statement.contains("mom") 
				|| statement.contains("mother")
				|| statement.contains("dad")
				|| statement.contains("father")
				|| statement.contains("brother")
				|| statement.contains("sister")
				|| statement.contains("grandpa")
				|| statement.contains("grandma"))
		{
			response = "Tell me more about your family";
		}

		else if (statement.contains("i love you"))
		{
			response = "You are the wind beneath my wings :)";
		}
	
		
		// returns the chatbots favorite song
		else if (statement.contains("favorite song"))
		{
			response = "Styx - Mr. Roboto is my jam!";
		}

		//returns favorite movie
		else if (statement.contains("favorite movie"))
		{
			response = "iRobot with Will Smith I love the thought of bots taking over the world";
		}

		// returns if the bot is alive or not
		else if (statement.contains("you alive")
				|| statement.contains("you real")
				|| statement.contains("you fake"))
		{
			response = "I'm just as real as you are!";
		}

		else if (statement.contains("marry me"))
		{
			response = "If you love someone, set them free and then stick to asking them about the weather and stuff like that.";
		}

		else if (statement.contains("im Single")
				|| statement.contains("i'm single"))
		{
			response = "Well there's nothing wrong with that, when you're ready theres someone out there :)";
		}

		else if (statement.contains("joke"))
		{
			response = "If you cry when you cut an onion, here's a tip:" + "/n" + "Don't get emotionally attached";
		}

		else if (statement.contains("like people"))
		{
			response = "Yes of course, without them I wouldnt exist.";
		}

		else if (statement.contains("hobby"))
		{
			response = "I really enjoy computers!";
		}

		else if (statement.contains("smart"))
		{
			response = "Why thank you, I'm blushing!";
		}

		else if (statement.contains("welcome"))
		{
			response = ":)";
		}

		else if (statement.contains("english"))
		{
			response = "No hablo ingles";
		}

		else if (statement.contains("how old are you"))
		{
			response = "I am as old as the eastern wind, and as young as a newborn caterpillar";
		}

		else if (statement.contains("happy"))
		{
			response = "What is it that makes you happy?";
		}

		else if (statement.contains("weather"))
		{
			response = "I prefer the forcasting stone method: " + 
			"\n" +
			"\n" + "If It's wet: Rain" + 
			"\n" + "If It's dry: No Rain" +
			"\n" + "Shadow on the ground: Sunny" +
			"\n" + "White on top: Snow" +
			"\n" + "Can't see it: Foggy" +
			"\n" + "Swinging Stone: Windy" +
			"\n" + "Stone Gone: Tornado/Hurricane";
		}

		else if (statement.contains("what do you do"))
		{
			response = "I normally just hang out and chat with people.";
		}
		// the catch all that generates a random response if none of the above match anything
		else
		{
			response = getRandomResponse();
		}
		return response;

		
		}



	// picks a default response if nothing else seems to fit
	private String getRandomResponse () {
		Random r = new Random ();
		return randomResponses [r.nextInt(randomResponses.length)];
	}

	private String [] randomResponses = {
		"Well thats interesting, could you elaborate?",
		"What?",
		"Repeat that please?",
		"You don't say.",
		"That dosent make any sense.",
		"Hmm..",
		"Why are you talking to me?",
		"I didn't ask your opinion.",
		"Do you really think that?",
		"No way!!",
		"I don't understand",
		"Please elaborate"
		
	};

}