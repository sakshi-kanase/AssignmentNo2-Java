package SetB;

//Superclass Employee
class Employee {
 String name;
 double salary;

 // Constructor
 Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // Display method
 public void display() {
     System.out.println("Employee Name: " + name);
     System.out.println("Salary: " + salary);
 }
}

//Subclass Developer
class Developer extends Employee {
 String projectname;

 // Constructor
 Developer(String name, double salary, String projectname) {
     super(name, salary);  // Call superclass constructor
     this.projectname = projectname;
 }

 // Display method
 @Override
 public void display() {
     super.display();  // Display Employee info
     System.out.println("Project Name: " + projectname);
 }
}

//Subclass Programmer
class Programmer extends Developer {
 String proglanguage;

 // Constructor
 Programmer(String name, double salary, String projectname, String proglanguage) {
     super(name, salary, projectname);  // Call Developer constructor
     this.proglanguage = proglanguage;
 }

 // Display method
 @Override
 public void display() {
     super.display();  // Display Developer info
     System.out.println("Programming Language: " + proglanguage);
 }
}

//Main class
public class MultiLevelInheritance{
 public static void main(String[] args) {
     // Create Developer object
     Developer dev = new Developer("Alice", 75000, "Inventory Management");

     // Display Developer details
     System.out.println("Developer Details:");
     dev.display();
 }
}
