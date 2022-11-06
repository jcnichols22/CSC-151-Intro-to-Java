/*
 * Tweet Count
 *
 * You are to write a program that prompts and accepts a tweet from someone of 140 characters or less.
 * You will print if the length was correct, number of hashtags (#), number of attributions (@), 
 * number of web links (http://). 
 * 
 * If the tweet was over 140 characters, you will need to print how much over 140 it was.
 * 
 * Sample Run 1:
 * 
 * Please enter a tweet:
 * @kewlfrogz says #holla http://dubdubdub.dubya.com
 * Length Correct
 * Number of Hashtags: 1
 * Number of Attributions: 1
 * Number of Links: 1
 * 
 * Sample Run 2:
 * 
 * Please enter a tweet:
 * @whgates #Xbox stomps all over #Playstation - like #PizzaHut wings beasts #PapaJohns wings, but #PCgaming is Godzilla! WHO DA MASTA!? http://www.pcgamingrulezall.com
 * Excess Characters: 25
 */

import java.io.*;
import java.util.Scanner;


class Tweet {

   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = input.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    
         input.close(); 
   }

}