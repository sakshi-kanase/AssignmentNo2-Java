package SetA;

//Base class Point
class Point {
 protected int x;
 protected int y;

 // Default constructor
 public Point() {
     this.x = 0;
     this.y = 0;
 }

 // Parameterized constructor
 public Point(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // Display method
 public void display() {
     System.out.println("Point coordinates: (" + x + ", " + y + ")");
 }
}

//Subclass ColorPoint extends Point and adds color
class ColorPoint extends Point {
 private String color;

 // Default constructor
 public ColorPoint() {
     super();
     this.color = "undefined";
 }

 // Parameterized constructor
 public ColorPoint(int x, int y, String color) {
     super(x, y);
     this.color = color;
 }

 // Display method
 @Override
 public void display() {
     System.out.println("ColorPoint coordinates: (" + x + ", " + y + "), Color: " + color);
 }
}

//Subclass Point3D extends Point and adds z coordinate
class Point3D extends Point {
 private int z;

 // Default constructor
 public Point3D() {
     super();
     this.z = 0;
 }

 // Parameterized constructor
 public Point3D(int x, int y, int z) {
     super(x, y);
     this.z = z;
 }

 // Display method
 @Override
 public void display() {
     System.out.println("Point3D coordinates: (" + x + ", " + y + ", " + z + ")");
 }
}

//Demo class to test the implementation
public class Point1 {
 public static void main(String[] args) {
     Point p1 = new Point();              // Default Point
     Point p2 = new Point(5, 10);        // Parameterized Point
     ColorPoint cp1 = new ColorPoint();  // Default ColorPoint
     ColorPoint cp2 = new ColorPoint(3, 4, "Red"); // Parameterized ColorPoint
     Point3D p3d1 = new Point3D();       // Default Point3D
     Point3D p3d2 = new Point3D(7, 8, 9); // Parameterized Point3D

     p1.display();
     p2.display();
     cp1.display();
     cp2.display();
     p3d1.display();
     p3d2.display();
 }
}

