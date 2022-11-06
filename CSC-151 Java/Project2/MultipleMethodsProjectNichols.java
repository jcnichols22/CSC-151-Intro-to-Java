import java.util.Scanner;

/*
 * Multiple Method Return Project
 * 
 * For this application, you will write methods that satisfy a number of program requirements.
 * Start by creating your main method, this will be like all others. You will then send data to methods that will perform 
 * certain functions and then they will return the result to the main method and the main method will print out the result.
 * 
 * 1) takes an array of ints as a parameter and returns the sum of the integers in the array.
 * 
 * 2) takes an array of ints as a parameter and returns the double average of the integers in the array.
 *
 * 3) takes an array of ints as a parameter and returns the largest integer in the array.
 *
 * 4) takes an array of ints as a parameter and returns the smalles integer in the array.
 *
 * 5) takes an array of ints as a parameter and returns the double average of the even values in the array.
 * 
 */

//don't forget to alter the class and file name with your name, and comment your code
class MultipleMethodsProjectNichols {
  
    public static void main(String[] args){
    
         Scanner scan = new Scanner(System.in);
         
         //establish a fixed array to accept user input
         int[] array = new int[5];
         
         //Prompt the user for the integers
         System.out.println("Please enter 5 integers");
         
         //Loop to place values in to elements of the array, 
         //note how the scan is within the for loop to step in to each element space and place the input value         
         for (int i = 0; i < array.length; i++){
            int arrayInt = scan.nextInt();
            array[i] = arrayInt;
         }
         scan.close();
         
         //you need to create each of the methods called from the print statement, outside of the main
         System.out.println("\nSum: " + sum(array));
         
         System.out.println("Average: " + average(array));
         
         System.out.println("Largest: " + findMax(array));
         
         System.out.println("Smallest: " + findMin(array));
         
         System.out.println("Average of Evens: " + sumEven(array));
    }

    static int sum(int[] array){
        int sum = 0;
        // loops through the array starting at 0 index assigning sum the value 
        // adding the next value to sum everytime the loop runs
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double average(int[] array){
        // getting array length
        int length = array.length;
        int sum = 0;
        // loops through the array starting at 0 index assigning sum the value 
        // adding the next value to sum everytime the loop runs 
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    
        return sum / length;
    }

    static int findMax(int[] array){
        int max = array[0];
        // lopps trhough the array assigning each value and testing if it is greater than the value
        // this continues through the end of the loop but dosent assign any values unless they are greater than the 
        // previous value
        for (int i = 0; i < array.length; i++){
            if (array[i] > max)
            max = array[i];
        }
        return max;
    }

    static int findMin(int[] array){
        int min = array[0];
        // basically just copy and pasted the findMax code and replaced the greater than with less than 
        // since it is basically the same process but opposite results
        for (int i = 0; i > array.length; i++){
            if (array[i] < min)
            min = array[i];
        }
        return min;
    }

    static double sumEven(int[] array){
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sum += array[i];
                counter++;
            }           
                       
        }
        int avg = sum / counter;
        return avg;
    }
    
}