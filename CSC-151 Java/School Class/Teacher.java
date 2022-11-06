public class Teacher extends Person{
  
    private String course;
   
    public Teacher(String fName, String lName, String subject)
    {
        // The first and last names are set by calling the parent class.
        super(fName, lName);
        course = subject;
    }
   
    // Returns a two line String with formatted:
    // Nichols, Josh
    //    Subject: Computer Science
    public String toString()
    {
        String teachOutput = super.toString();
        teachOutput = teachOutput + "\n   " + "Subject: " + course;
        return teachOutput;
    }
   
 
 }