/*
 * If-Else If-Else
 
 * 1. Test if an integer input from the keyboard is odd or even; modulus is a great choice to use for this.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 * 2. Ask the user to input the number of wheels. Based on their input, print out what type of vehicle it is.
 * Please include at least 3 vehicles and use a range of wheels using &&, and a choice of either set of wheels using ||
 * If they do not choose a number you have, give them a catch all answer using else.
 *    
 *    Sample Run 1: 
         Enter number of wheels:
         2
         Bike
         
      Sample Run 2:
         Enter number of wheels:
         18
         Tractor trailer
         
      Sample Run 3:
         Enter number of wheels:
         0 //not in the code selection
         Hoverboard
 */

import java.util.Scanner;
import java.lang.Math;


public class IfElseIfElseJosh {   

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int num = input.nextInt();
      
      if(num % 2 == 0)
          System.out.println(num + " is even");
      else
          System.out.println(num + " is odd");
          
            
   System.out.println("Enter number of wheels: ");
   int wheels = input.nextInt(); 

   if (wheels > 1 && wheels < 3)
      System.out.print("Bike");
   else if (wheels == 4)
      System.out.print("Car");
   else if (wheels == 0 || wheels == 1-1)
      System.out.print("Hoverboard");
   else if (wheels == 18)
      System.out.print("Tractor Trailer");
   else
      System.out.print("Invalid Input");
   input.close();
   
        
          

   }
}