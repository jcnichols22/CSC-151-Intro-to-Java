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

//import java.io.*;
import java.util.Scanner;


class TweetCountNichols {

   public static void main(String[] args) {
      // establishes some inital variables before computation
      int hashtag=0;
      int mentions = 0;
      int links = 0;
      int lastIndex = 0;
      String findLink = "http://";
      // creates scanner for user input
      Scanner input = new Scanner(System.in);
      // asks the user to enter a tweet
      System.out.println("Please enter a tweet: ");
      String tweet = input.nextLine();
      // assigns the tweet character count ton integer variable length
      int length = tweet.length();
           
      // the tweet array stores each character as individual data types. 
      for(char ch: tweet.toCharArray()){
         //if statement searches for # character and each time it is found adds 1 to the hastag variable
         if(ch == '#'){
            hashtag++;
         }
         // searches for @ character and adds 1 to the mentions variable each time it is found.
         if(ch == '@'){
            mentions++;
         }

         // convert the tweet to lower case so HTTP:// and http:// are the same
         String tweetLower = tweet.toLowerCase();
         // executes while the last index is -1
         while (lastIndex != -1) {
            
            /*Returns the index within tweetLower of the first occurrence of the specified substring, starting at the specified index(lastIndex).
            if no value exists matching the substring -1 is returned stopping the while loop */
            lastIndex = tweetLower.indexOf(findLink, lastIndex);
            // executes if above line returns a value to lastIndex
            if (lastIndex != -1) {
                links++;
                lastIndex += findLink.length();
            }
        }
     
         
      }      
      // if else statement to deal with all the data so far

      if (length <= 140){
         //prints statements if tweet is 140 or less characters
         System.out.println("Correct Length");
         System.out.println("Number of Hashtags: " + hashtag);
         System.out.println("Number of Attributions: " + mentions);
         System.out.println("Number of links: " + links);
      }
      else{
         // computes and prints if characters exceed 140 characters and alerts the user to how many characters over
         int excessChar = (length - 140);
         System.out.println("Excess characters: " + excessChar);
      }
   input.close(); 
   }

}