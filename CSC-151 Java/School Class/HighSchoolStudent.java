public class HighSchoolStudent extends Student{

    private double gradePointAvg;
   
    
    public HighSchoolStudent(String fName, String lName, int gLevel, double gpa)
    {
        // The first and last names and the level are set by calling the parent class. 
        super(fName, lName, gLevel);
        //The GPA should be between 0 and 5
        if(gpa >= 0 && gpa <= 5)
            gradePointAvg = gpa;
        // not between 0 and 5 set to zero    
        else
            gradePointAvg = 0;
       
    }
   
    // Returns a four line String formatted:
    //    Nichols, Josh
    //       Grade Level: 12
    //       ID #: 1
    //       GPA: 4.0
    public String toString()
    {
        String hSStudent = super.toString();
        hSStudent = hSStudent + "\n   " + "GPA: " + gradePointAvg;
        return hSStudent;
    }
   
   
 }