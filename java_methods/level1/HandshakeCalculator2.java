package java_methods.level1;

import java.util.Scanner;

public class HandshakeCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes possible is: " + handshakes);
    }
}