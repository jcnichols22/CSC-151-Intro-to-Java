import java.util.ArrayList;

public class School {

   // A list of pupils at the school.
   private ArrayList<Student> pupils;
   // A list of instructors at the school.
   private ArrayList<Teacher> instructors;
  
   // specifies instructors and pupils at the school.
   public School(ArrayList<Student> students, ArrayList<Teacher> teachers)
   {
       pupils = students;
       instructors = teachers;
   }
  
   public String getGradeLevel(int level)
   {
       // Returns an empty String if the school has no pupils at the specified level.
       String gradLevelOutput = "";
       for(Student student1: pupils)
       {
           // Returns a String listing all the schools's pupils that are at the specified grade level.
           if(student1.getLevel() == level)
               gradLevelOutput = gradLevelOutput + student1 + "\n";
       }
       return gradLevelOutput;
   }
  
   // Returns a multi line String listing the instructors and pupils at the school.
   // formatted   
   // Faculty:
   // Nichols, Josh
   //    Subject: Course
    //
   // Student Body:
   // Nichols, Josh
   //    Grade Level: 12
   //    ID #: 1
   //    GPA: 4.0
   public String toString()
   {
       String pupilInstructorString = "";
      
       String pupilOutput = "";
       for(Student student1: pupils)
       {
           pupilOutput = pupilOutput + student1 + "\n";
       }
      
       String instructorOutput = "";
       for(Teacher teacher1: instructors)
       {
           instructorOutput = instructorOutput + teacher1 + "\n";
       }
       pupilInstructorString = "Faculty:" + "\n" + instructorOutput + "\n\n";
       pupilInstructorString = pupilInstructorString + "Student Body:" + "\n" + pupilOutput;
       return pupilInstructorString;
   }
  
  
  
  
}