/*
 * User Input and Variables 
 1. Write the code to ask the user to enter their name and print the following message replacing _____ with their name:

  Hi ______, nice to see you.
  
  Remember, you'll need to use the method println and Scanner class method nextLine.
  *
  2. Write an algorithm that asks the user for three names, then prints the names in reverse order.

  Sample Run:

  Please enter three names:
  >> Zoey 
  >> Zeb 
  >> Zena 

  Zena Zeb Zoey
  *
  3. Write an algorithm that will ask the user to enter an adjective, a name, and their age. Print the following sentence, replacing the ______ with the values they entered.

  My name is _____. I am _____, and ____ years old.

  Sample Run:

  Hi there. What is your name?
  >> Ada
  What adjective describes you?
  >> logical
  How old are you?
  >> 25
  My name is Ada. I am logical, and 25 years old.
  *
 */

import java.util.Scanner;  //required input to use the Java Library Class Scanner in the code below

class JavaInput1Nichols { //append your name to the end of the class name, and then save the file to reflect the class name
    
    public static void main(String[] args) {
    
      try (Scanner scanStr = new Scanner(System.in)) {
        //accept user name
              System.out.println("Hello, what is your name? ");
              String name = scanStr.nextLine();   //nextLine() will take everything the user inputs as a String, there are many other input types, the other you will use for this assignment is nextInt() to be placed in an int variable.
              
              //print a greeting with name 
              System.out.print("\nIt is nice to meet you " + name + ", hope you are fine.");  //note the concatenation (+) of the variable, or data value, betweeen the "Literal" String outputs.
              
              /***part2***/
              
              //accept three names
              System.out.print("\nPlease enter three names: \n");
                //instantiate three String variables to be printed in reverse order
                String a;
                String b;
                String c;
                a = scanStr.nextLine();
                b = scanStr.nextLine();
                c = scanStr.nextLine();
        
                //print to the console in rev order
                System.out.println(c+ " " + b + " " + a);
                 
        
              
              
              /***part 3***/
                 //you got this part...
               System.out.println("Hi there. What is your name?");
                       String name1 = scanStr.nextLine();
               System.out.println("What adjective describes you?");
                       String adjective = scanStr.nextLine();
               System.out.println("How old are you?");
                       int age = scanStr.nextInt();
        
               //Print to console
                System.out.println("My name is " + name1 + ". " + "I am " + adjective + ", " + "and " + age + " years old.");
}
      
      //create a second variable and instantiate the Scanner class again to it

      /***part 1***/
      
   }//end of main
} 
   /*
   *  Take note of the non programming standards that are just as important; spacing, indentation within {}, and commenting; makes it very easy to read for others, as well as grade and suggest improvement for your instructor :].
   */

