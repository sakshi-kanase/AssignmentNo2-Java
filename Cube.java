package Series;

public class Cube {
    public void printSeries(int n) {
        System.out.print("Cube Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}
