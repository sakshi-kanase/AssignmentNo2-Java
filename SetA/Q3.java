package SetA;

import java.util.Scanner;

//Employee class
class Employee {
 int id;
 String name;
 double salary;

 // Default constructor
 Employee() {
     id = 0;
     name = "";
     salary = 0.0;
 }

 // Accept method
 public void accept(Scanner sc) {
     System.out.print("Enter Employee ID: ");
     id = sc.nextInt();
     sc.nextLine();  // Clear input buffer
     System.out.print("Enter Employee Name: ");
     name = sc.nextLine();
     System.out.print("Enter Employee Salary: ");
     salary = sc.nextDouble();
 }

 // Display method
 public void display() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
 }
}

//Manager class
class Manager extends Employee {
 private double bonus;

 // Default constructor
 Manager() {
     super(); // Call to Employee constructor
     bonus = 0.0;
 }

 // Accept method
 @Override
 public void accept(Scanner sc) {
     super.accept(sc);
     System.out.print("Enter Bonus: ");
     bonus = sc.nextDouble();
 }

 // Display method
 @Override
 public void display() {
     super.display();
     System.out.println("Bonus: " + bonus);
     System.out.println("Total Salary: " + getTotalSalary());
 }

 // Method to calculate total salary
 public double getTotalSalary() {
     return salary + bonus;
 }
}

//Main class
public class Q3 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of managers: ");
     int n = sc.nextInt();

     Manager[] managers = new Manager[n];

     // Accept details
     for (int i = 0; i < n; i++) {
         System.out.println("\nEnter details for Manager " + (i + 1) + ":");
         managers[i] = new Manager();
         managers[i].accept(sc);
     }

     // Find manager with maximum total salary
     Manager maxManager = managers[0];
     for (int i = 1; i < n; i++) {
         if (managers[i].getTotalSalary() > maxManager.getTotalSalary()) {
             maxManager = managers[i];
         }
     }

     // Display the manager with maximum total salary
     System.out.println("\nManager with Maximum Total Salary:");
     maxManager.display();

     sc.close();
 }
}
