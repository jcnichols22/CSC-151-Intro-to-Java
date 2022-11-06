/*
 * Part 2: Strand
 * A class which represents a strand of lights.
 
 * For this assignment, you will be writing a class called Strand that represents a strand of lights. 
 * The lights in Strand are instances of the Light class that you created in Part 1 Light. 
 
 *** Make sure you append your last name to Light to reflect what you created for your Light class ***
 
 * The Strand class needs the Light class in the same file folder to work properly.
 
 * As in Part 1 of this assignment, your job is to add code to Strand.java so that your implementation meets the requirements specified below. 
 * To complete the assignment, replace all the /* missing code / comments in the file with your own code. 
 
 * You will need to customize Light instantiations to reflect LightLastname and StrandLastname.
 * Please hand in Light ***AND*** Strand together so that I can test your creation.
 
 Variables
 ArrayList strand - An ArrayList that stores a strand of lights based on the Light class.  ArrayList <LightLastName> creates the Light type to be store in each ArrayList element.
 
 Methods
 Strand() - Default constructor that sets strand to an ArrayList holding one turned on white bulb, that is not burnt out.
 Strand(int n) - A constructor that sets strand to an ArrayList of size n, holding n white bulbs, that are all turned on and not burnt out. If n <= 0, then the strand should be set to size one, with a white bulb, on and not burnt out.
 String toString() - This method returns a String representation of the Light objects in the ArrayList , one per line. For example:
 
  on green    not burnt out
  off red    not burnt out
  off green    burnt out
  on blue    not burnt out
  on red    not burnt out
  
 void setColor(String c) - This method sets the color of all the light bulbs in the entire Strand. The color variable is set to c only if c is "red", "green" or "blue". It should ignore the case of the value in c. If c holds any value other than "red", "green" or "blue", color will be set to "white".
 void setMulti() - This method sets the light bulbs to the pattern "red", "green", "blue", "red", "green", "blue",... until the end of the strand.
 void turnOn() - This method turns on all the lights in the strand. Each individual bulb can only be turned on if it's burntOut variable is false.
 void turnOff() - This method turns off all the lights in the strand.
 void burnOut(int i) - This method sets the Light at location i's burntOut variable to true.
 
 Sample Run:
1. Test the default constructor Strand()
*** PASS: Strand() creates a list of size 1

2. Test the constructor Strand(n)
*** PASS: Strand(0) creates a list of size 1
*** PASS: Strand(-7) creates a list of size 1
*** PASS: Strand(5) creates a list of size 5
*** PASS: Strand(5) initialized bulbs correctly

3. Test setColor(String)
*** PASS: setColor worked as expected (green test)
*** PASS: setColor worked as expected (pink test)

4. Test turnOff()
*** PASS: turnOff() worked as expected

5. Test turnOn()
*** PASS: turnOn() worked as expected

6. Test burnOut(n)
*** PASS: burnOut(1) works as expected.
 */
 
import java.util.ArrayList;

public class StrandNichols
{
	// An ArrayList that stores a strand of lights based on the Light class, i.e. Light type
	private ArrayList<LightNichols> strand = new ArrayList<LightNichols>();

	// Default constructor that sets strand to an ArrayList holding one
	// turned on white bulb, that is not burnt out.
	   
    public StrandNichols() {
		strand.add(new LightNichols());
	  }

	// A constructor that sets strand to an ArrayList of size n, holding
	// n white bulbs, that are all turned on and not burnt out. If n <= 0,
	// then the strand should be set to size one, with a white bulb, on
	// and not burnt out.
	
    public StrandNichols(int n) {
		if (n <= 0) {
		  n = 1;
		}
		for (int i = 0; i < n; i++) {
		  strand.add(new LightNichols());
		}
	  }

	// This method returns a String representation of the
	// Light objects in the ArrayList, one per line. For example,
	// here is the String returned when toString is called on a
	// Strand with 5 lights:
	//
	// on green    not burnt out
	// off red    not burnt out
	// off green    burnt out
	// on blue    not burnt out
	// on red    not burnt out
	//
	// Note: there is one space between "off"/"on" and the value for
	// color, and a tab before the "burnt out" or "not burnt out".
	
    public String toString() {
		String result = "";
		for (LightNichols light : strand) {
		  result += light + "\n";
		}
		return result;
	  }

	// This method sets the color of all the light bulbs in the entire Strand.
	   
    public void setColor(String c) {
		for (LightNichols light : strand) {
		  light.setColor(c);
		}
	  }

	// This method sets the light bulbs to the pattern "red", "green", "blue",
	// "red", "green", "blue",... until the end of the strand.
	   
    public void setMulti() {
		String[] colors = {"red", "green", "blue"};
		int colorIndex = 0;
		for (LightNichols light : strand) {
		  light.setColor(colors[colorIndex++ % 3]);
		}
	  }

	// This method turns on all the lights in the strand. Each individual bulb
	// can only be turned on if it's burntOut variable is false.
	
    public void turnOn() {
		for (LightNichols light : strand) {
		  if (!light.isOn()) {
			light.flip();
		  }
		}
	  }

	// This method turns off all the lights in the strand.
	   
    public void turnOff() {
		for (LightNichols light : strand) {
		  if (light.isOn()) {
			light.flip();
		  }
		}
	  }

	// This method sets the Light at location i's burntOut variable to true.
	   
    public void burnOut(int i) {
		strand.get(i).burnOut();
	  }
   
   //**************** DO NOT EDIT BELOW HERE EXCEPT TO CHANGE Strand TO REFLECT CLASS/FILE NAME ****************
	public static void main(String[] args)	{
   
		// *************************************************************************
		// 1. Test Strand()
		// *************************************************************************
		System.out.println("1. Test the default constructor Strand()");
		StrandNichols strand1 = new StrandNichols();
		if (strand1.strand.size() == 1)
			System.out.println("*** PASS: Strand() creates a list of size 1");
		else
			System.out.println("*** FAIL: Strand() creates a list of size "
					+ strand1.strand.size()
					+ ", when a list of size 1 is expected.");

		// ***********************************
		// 2. Test Strand(n)
		// ***********************************
		System.out.println("\n2. Test the constructor Strand(n)");
		// Try to create a strand of lights with 0 bulbs
		StrandNichols emptyStrand = new StrandNichols(0);
		if (emptyStrand.strand.size() == 1)
			System.out.println("*** PASS: Strand(0) creates a list of size 1");
		else
			System.out.println("*** FAIL: Strand(0)  creates a list of size "
					+ emptyStrand.strand.size()
					+ ", when a list of size 1 is expected.");
		// Try to create a strand of lights with a negative number
		StrandNichols negativeStrand = new StrandNichols(-7);
		if (negativeStrand.strand.size() == 1)
			System.out.println("*** PASS: Strand(-7) creates a list of size 1");
		else
			System.out.println("*** FAIL: Strand(-7) creates a list of size "
					+ negativeStrand.strand.size()
					+ ", when a list of size 1 is expected.");
		// Try to create a strand of lights with a positive number
		StrandNichols strandWithFiveBulbs = new StrandNichols(5);
		if (strandWithFiveBulbs.strand.size() == 5)
			System.out.println("*** PASS: Strand(5) creates a list of size 5");
		else
			System.out.println("*** FAIL: Strand(5) creates a list of size "
					+ strandWithFiveBulbs.strand.size()
					+ ", when a list of size 5 is expected.");
		// Verify that all the light bulbs are initialized properly
		boolean success = true;
		for (LightNichols bulb : strandWithFiveBulbs.strand)
		{
			if (!(bulb.isOn() && bulb.getColor().equals("white")))
			{
				success = false;
			}
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success)
		{
			System.out.println("*** PASS: Strand(5) initialized bulbs correctly");
		}
		else
		{
			System.out.println("*** FAIL: Strand(5) did not initialize bulb(s) correctly");
		}


		// ***********************************
		// 3. Test setColor(String)
		// ***********************************
		System.out.println("\n3. Test setColor(String)");
		// All of the bulbs in our strandWithFiveBulbs are white. Set them to
		// green.
		strandWithFiveBulbs.setColor("green");
		success = true;
		for (LightNichols light : strandWithFiveBulbs.strand)
		{
			if (!light.getColor().equals("green"))
				success = false;
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success)
			System.out.println("*** PASS: setColor worked as expected (green test)");
		else
			System.out.println("*** FAIL: setColor did not work as expected (green test)");
		// Now try to set them to a color that is not supported.  This should 
		// cause all the bulbs to be set back to white.
		strandWithFiveBulbs.setColor("pink");
		success = true;
		for (LightNichols light : strandWithFiveBulbs.strand)
		{
			if (!light.getColor().equals("white"))
				success = false;
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success)
			System.out.println("*** PASS: setColor worked as expected (pink test)");
		else
			System.out.println("*** FAIL: setColor did not work as expected (pink test)");
		

		// ***********************************
		// 4. Test turnOff()
		// ***********************************
		System.out.println("\n4. Test turnOff()");
		strand1.turnOff();
		if (strand1.strand.size() > 0 && !strand1.strand.get(0).isOn())
		{
			System.out.println("*** PASS: turnOff() worked as expected");
		}
		else
		{
			System.out.println("*** FAIL: turnOff() did not work as expected");
		}
		
		// ***********************************
		// 5. Test turnOn()
		// ***********************************
		System.out.println("\n5. Test turnOn()");
		strand1.turnOn();
		if (strand1.strand.size() > 0 && strand1.strand.get(0).isOn())
		{
			System.out.println("*** PASS: turnOn() worked as expected");
		}
		else
		{
			System.out.println("*** FAIL: turnOn() did not work as expected");
		}

		// ***********************************
		// 6. Test burnOut(int)
		// ***********************************
		System.out.println("\n6. Test burnOut(n)");
		strand1.burnOut(0);
		if (strand1.toString().equals("off white\tburnt out\n"))
		{
			System.out.println("*** PASS: burnOut(1) works as expected.");
		}
		else
		{
			System.out.println("*** FAIL: burnOut(1) does not work as expected.");
		}
      
      // ************************************
      // 7. Test setMulti()
      // ************************************
      System.out.println("\n7. Test setMulti(n)");
      // Try to create a strand of lights with a positive number
	  StrandNichols sw12b = new StrandNichols(12);
      
      //test if strand was created
      if (sw12b.strand.size() == 12)
			System.out.println("*** PASS: StrandAnswer(12) creates a list of size 12");
		else
			System.out.println("*** FAIL: StrandAnswer(12) creates a list of size "
					+ sw12b.strand.size()
					+ ", when a list of size 12 is expected.");
               
      //change all bulbs colors to the multi color pattern
      sw12b.setMulti();
               
		// Verify that all the light bulbs are initialized properly
		success = true;
		for (int i = 0; i < sw12b.strand.size(); i++){
      
			if(i % 3 == 0){
            if(!(sw12b.strand.get(i).isOn() && sw12b.strand.get(i).getColor().equals("red"))){
				   success = false;
            }
			}
         else if(i % 3 == 1){
            if(!(sw12b.strand.get(i).isOn() && sw12b.strand.get(i).getColor().equals("green"))){
				   success = false;
            }
         }
         else{
            if(!(sw12b.strand.get(i).isOn() && sw12b.strand.get(i).getColor().equals("blue"))){
				   success = false;
            }
         }
		}
      //print pass or fail based on logic
		if (sw12b.strand.size() > 0 && success){
			System.out.println("*** PASS: StrandAnswer(12) initialized bulbs correctly");
		}
		else{
			System.out.println("*** FAIL: StrandAnswer(12) did not initialize bulb(s) correctly");
		}

	}
}
