package Series;

import Series.Fibonacci;
import Series.Cube;
import Series.Squares;
import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = scanner.nextInt();

        // Creating objects
        Fibonacci fib = new Fibonacci();
        Cube cube = new Cube();
        Squares square = new Squares();

        // Printing series
        fib.printSeries(n);
        cube.printSeries(n);
        square.printSeries(n);

        scanner.close();
    }
}

