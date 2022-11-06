public class TestSubClass {
    public static void main(String[] args) {

        System.out.println("Making an instance of 'Person'");
        Person p1 = new Person();
        System.out.println("Returning value of call to getter: " + p1.getThePerson());
        p1.PerFoo();
        p1.PerFoo(1);

        System.out.println();

        System.out.println("Making an instance of 'Employee'");
        Employee e1 = new Employee();
        System.out.println("Returning value of call to getter: " + e1.getThePerson());
        e1.EmpFoo();
        e1.PerFoo();
        e1.PerFoo(2);

        System.out.println();

        System.out.println("Making an instance of 'Faculty'");
        Faculty f1 = new Faculty("test");
        System.out.println("Returning value of call to getter: " + f1.getThePerson());
        f1.FacFoo();
        f1.EmpFoo();
        f1.PerFoo();
        f1.PerFoo(2);

        System.out.println();

    }
}


class UnderGrad extends Student {

    void UndFoo() {
        System.out.println("In UnderGrad UndFoo");
    }

    UnderGrad(){
        System.out.println("In UnderGrad constructor");
    }
}

class Student extends Person {

    void StuFoo() {
        System.out.println("In Student StuFoo");
    }

    Student(){
        System.out.println("In Student constructor");
    }
}

class Faculty extends Employee {

    int thePerson = 3;

    Faculty() {
        // The Employee constructor is automatically called here -- super();

        System.out.println("In Faculty constructor");

        // Calling the EmpFoo method in superclass Employee.
        super.EmpFoo();

        // Calling the PerFoo method in superclass Employee.
        super.PerFoo();
    }

    Faculty(String s) {

        // Calling the overloaded no-arg constructor in this class [Faculty].
        this();

        System.out.println("In Faculty constructor passing String: " + s);
    }

    void FacFoo() {
        System.out.println("In Faculty FacFoo");
    }

    @Override
    void EmpFoo() {
        System.out.println("In Faculty class overridden EmpFoo");
    }
}

class Employee extends Person {

    int thePerson = 2;

    void EmpFoo() {
        System.out.println("In Employee EmpFoo");
    }

    @Override
    void PerFoo(int i) {

        // Calling the overridden method in the superclass [Person].
        super.PerFoo();

        // Calling the overloaded method in this class [Employee].
        this.PerFoo();

        System.out.println("In overridden PerFoo(" + i + ") in Employee");
    }

    @Override
    void PerFoo() {
        System.out.println("In overridden PerFoo in Employee");

        // Calling the overridden method in the superclass [Person].
        super.PerFoo();
    }

    @Override
    int getThePerson() {

        // Calling the superclasses' overridden method can be done anywhere in this method and/or
        //   as many times as wanted.
        super.getThePerson();

        System.out.println("In Employee get");

        super.getThePerson();

        return thePerson;
    }

    Employee() {

        // This call to super() [which is the no-arg Person constructor] is done automatically
        // Comment this line out and see how super() is still called.
        super();

        System.out.println("In Employee constructor");
    }
}

class Person {

    int thePerson = 1;

    void PerFoo() {
        System.out.println("In Person PerFoo");
    }

    int getThePerson() {
        System.out.println("In Person get");

        return this.thePerson;
    }

    void PerFoo(int i) {
        System.out.println("In Person PerFoo(" + i + ")");
    }

    Person(){
        System.out.println("In Person constructor");
    }
}
