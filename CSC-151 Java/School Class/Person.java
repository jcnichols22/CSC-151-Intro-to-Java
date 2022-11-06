public class Person {

    private String firstName;
    private String lastName;
   
    //Constructor takes in parameters for first and last names
    public Person(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }
   
    //Returns a string formatted: Nichols, Josh
    public String toString()
    {
        return (lastName + ", " + firstName);
    }
 }