import java.util.ArrayList;

public class runner_School
{

public static void main(String arg[]){
    Person p = new Person("John", "Doe");
    System.out.println("printing person:");
    System.out.println(p);
    
    Student s = new Student("Sallie", "Smithers", 7);
    System.out.println("\n\nprinting student:");
    System.out.println(s);
    
    System.out.println("\n\nprinting highschoolstudent:");
    HighSchoolStudent h = new HighSchoolStudent("Bert", "Smith", 11, 3.67);
    System.out.println(h);
    
    ArrayList<Student> student = new ArrayList<Student>();
    student.add(new HighSchoolStudent("Jem", "Finch", 11, 3.4));
    student.add(new Student("Scout", "Finch", 4));
    student.add(new HighSchoolStudent("Natalie", "Adams", 11, 2.4));
    student.add(new HighSchoolStudent("Boo", "Radley", 12, 1.7));
    student.add(new HighSchoolStudent("Atticus", "Finch", 12, 4.8));
    student.add(new Student("Elaine", "Benes", 9));
    student.add(new Student("Patrick", "Henry", 11));
    
    ArrayList<Teacher> teacher = new ArrayList<Teacher>();
    teacher.add(new Teacher("Ada", "Lovelace", "Mathematics"));
    teacher.add(new Teacher("Albert", "Einstein", "Physics"));
    teacher.add(new Teacher("Grace", "Hopper", "Computer Science"));
    teacher.add(new Teacher("Alan", "Turing", "Mathematics"));
    teacher.add(new Teacher("Marie", "Curie", "Chemistry"));
    teacher.add(new Teacher("Dolly", "Madison", "Government"));
    teacher.add(new Teacher("Maya", "Angelou", "English Composition"));
    
    School sch = new School(student, teacher);
    System.out.println("\n\nprinting school:");
    System.out.println(sch);
    System.out.println("\n\njust seniors: \n" + sch.getGradeLevel(12));

    }
}