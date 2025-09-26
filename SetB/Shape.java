package SetB;

import java.util.Scanner;

//Interface
interface Operation {
 double PI = 3.142;

 void area();
 void volume();
}

//Circle class
class Circle implements Operation {
 double radius;

 // Constructor
 Circle(double radius) {
     this.radius = radius;
 }

 // Implement area
 public void area() {
     double area = PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }

 // Implement volume (not applicable)
 public void volume() {
     System.out.println("Volume of Circle: Not applicable (0)");
 }
}

//Cylinder class
class Cylinder implements Operation {
 double radius, height;

 // Constructor
 Cylinder(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 // Implement area
 public void area() {
     double area = 2 * PI * radius * (radius + height);
     System.out.println("Surface Area of Cylinder: " + area);
 }

 // Implement volume
 public void volume() {
     double volume = PI * radius * radius * height;
     System.out.println("Volume of Cylinder: " + volume);
 }
}

//Main class
public class Shape {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Circle
     System.out.print("Enter radius of Circle: ");
     double r1 = sc.nextDouble();
     Circle circle = new Circle(r1);
     circle.area();
     circle.volume();

     System.out.println();

     // Cylinder
     System.out.print("Enter radius of Cylinder: ");
     double r2 = sc.nextDouble();
     System.out.print("Enter height of Cylinder: ");
     double h = sc.nextDouble();
     Cylinder cylinder = new Cylinder(r2, h);
     cylinder.area();
     cylinder.volume();

     sc.close();
 }
}

