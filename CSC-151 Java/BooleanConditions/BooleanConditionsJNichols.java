/*
 * Boolean Conditions - Octets and IP Address
 *
 * You are going to write a program that will accept 4 integer numbers from a user, check to see if they are valid
 * IP address range numbers (1 - 255).(0 - 255).(0 - 255).(1 - 254) 
 * and if they are valid you will put them in the correct dotted decimal notation for an IPv4 address X.X.X.X (i.e. 192.168.10.45).
 * If they are invalid, tell the user which one(s) is invalid.
 *
 * Sample Run 1:
 Please enter the first Octet:
 125
 Please enter the second Octet:
 10
 Please enter the third Octet:
 52
 Please enter the fourth Octet:
 10
 IP Address: 125.10.52.10
 *
 * Sample Run 2:
 Please enter the first Octet:
 125
 Please enter the second Octet:
 1000
 Please enter the third Octet:
 520
 Please enter the fourth Octet:
 10
 Octet two is incorrect.
 Octet three is incorrect.
 *  
 */

import java.io.*;
import java.util.Scanner;

class BooleanConditionsJNichols{

     public static void main (String str[]) throws IOException {

          //insert code here
          Scanner reader = new Scanner(System.in);  // Reading from System.in
          //User enters first octet
          System.out.println("Please enter the first octet: ");
          int octet1 = reader.nextInt();
          // user enters second octet
          System.out.println("Please enter the second octet: ");
          int octet2 = reader.nextInt();
          //user enters 3 octet
          System.out.println("Please enter the third octet: ");
          int octet3 = reader.nextInt();
          //user enters fourth octet
          System.out.println("Please enter the fourth octet: ");
          int octet4 = reader.nextInt();
          // Close
          reader.close();
          String incorrect = "";
          if ((octet1 < 1) || (octet1 > 255)) {
               incorrect += "Octet one is incorrect.\n";
          }          
          if ((octet2 < 0) || (octet2 > 255)) {
               incorrect += "Octet two is incorrect.\n";
          }
          if ((octet3 < 0) || (octet3 > 255)){
               incorrect += "Octet three is incorrect.\n";
          }
          if ((octet4 < 1) || (octet4 > 254)){
               incorrect += "Octet four is incorrect.\n";
          }
          if (incorrect.isEmpty()){
               System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
          }
               else{
                    System.out.print(incorrect);
               }
                    

          }
             }   
               
          
          

          
     



                       
     


          

     

