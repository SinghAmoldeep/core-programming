package java_methods.level3;
import java.util.*;
public class LineEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        sc.close();

        double distance = findEuclideanDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f\n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }

    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        if (x1 == x2) {
            throw new IllegalArgumentException("Vertical line detected. The slope is undefined because division by zero would occur.");        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        result[0] = m;
        result[1] = b;
        return result;
    }
}