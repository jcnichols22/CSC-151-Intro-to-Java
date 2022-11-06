/*
 * Major Method Project
 *  
 * You are taking over a project from a co-worker who has been fired for lying about being able to code Java.
 * You must now pick up from where he left off, luckily he was decent at commenting his code, just had a terrible attitude.
 * 
 * Sample Run:
 * Here are the numbers in the array:
 *  21 41 25 89 36 80 57 64 91 75
 * Here are the numbers in the array reversed:
 *  75 91 64 57 80 36 89 25 41 21
 * Please give me an integer value and an insert point between 0 - 9
 * 2
 * 3
 *
 * Here are the numbers in the array final result:
 *  75 91 64 2 57 80 36 89 25 41 
 */


import java.util.Scanner;



//append your last name to the class name, and saveAs the file as the same thing
public class MethodProNichols {
    
    //insert the integer in the index position and move all elements right (the 9th index will fall off)
   public static void insertValue(int[] a, int num, int index) {                       
      // check if index exis in array or not
      if (index >= a.length || index < 0){
         System.out.print("Index does not exist");
      }
      else{
          // now we will get the element from given index and will keep that into temp 
      int temp = a[index];
      //here insert num at index
      a[index] = num;

      // moving the array towards right 
      for (int i = index; i < a.length - 1; i++) {         
         num = temp;
         temp = a[i+1];
         a[i + 1] = num; 
         
      }
      }
   
   }
    
    //reverse the order of the elements
   public static void reverse(int rev[]){
      for(int i = 0; i < rev.length / 2; i++)
      {
          int temp = rev[i];
          rev[i] = rev[rev.length - i - 1];
          rev[rev.length - i - 1] = temp;
      }

   }
    
   //print the array
   public static void printit(int[] input, String s){
      // if statments based on the parameters of the called methods
      if (s.equals("")) {
         System.out.print("Here are the numbers in the array: ");
      for(int i = 0; i < input.length; i++){
         System.out.print(input[i] + " ");
         }
      }
      if (s.equals(" reversed")) {
         System.out.print("\nHere are the numbers in the array reversed: ");
      for(int i = 0; i < input.length; i++){
         System.out.print(input[i] + " ");
         }
      }
      if (s.equals(" final result")) {
         System.out.print("Here are the numbers in the array final result: ");
      for(int i = 0; i < input.length; i++){
         System.out.print(input[i] + " ");
         }
      }
      }

   
    
    //randomize() method will fill in elements with random numbers from 10 - 99
   public static void randomize(int[] input){
      for(int i = 0; i < input.length; i++){
         input[i] = ((int) (Math.random()*(100 - 10))) + 10;         
      }
      }

   
   /*you do not need to do anything to this main method, 
     you need to make the methods above that they call work.*/
   public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
     
      int [] randomNums = new int [10];
      
     //populate with random numbers by calling the method
      randomize(randomNums);
     
     //display the random numbers by calling the method
      printit(randomNums, "");
     
     //reverse the array element order
      reverse(randomNums);
     
     //display the random numbers by calling the method
      printit(randomNums, " reversed");
     
     //ask for two integers; inserted number and insert index
      System.out.println("\nPlease give me an integer value and an insert point between 0 - 9");
      int num = scan.nextInt();
      int index = scan.nextInt();
     
     //insert the value in the index point by calling the method    
      insertValue(randomNums, num, index);
     
     //display the final result
      printit(randomNums, " final result");
      scan.close();
   }
}