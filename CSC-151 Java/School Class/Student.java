public class Student extends Person{
  
    private static int studentId = 1;
    private int level;
    private int numStudent;
   
    // Constructor that accepts the first and last names and the student level.
    // The Student constructor also sets the studentId to the next available positive integer.
    public Student(String fName, String lName, int gLevel)
    {
        // The first and last names should be set by calling the parent class
        super(fName, lName);
        //student level should be 0 if glevel is not between 0 and 12
        if(gLevel >= 0 && gLevel <= 12)
            level = gLevel;
        else
            level = 0;
    numStudent = studentId;
        studentId++;
    }
   
    // Returns the student's grade level.
    public int getLevel()
    {
        return level;
    }
 
    // Returns a three line String formatted:
    // Nichols, Josh
    //   Grade Level:12
    //   ID #: 1
    public String toString()
    {
        String whole = super.toString();
        whole = whole + "\n   " + "Grade Level: " + level;
        whole = whole + "\n   " + "ID #: " + numStudent;
        return whole;
    }
}