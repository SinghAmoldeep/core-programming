package java_programming_elements.level1;

import java.util.Scanner;

public class Total_Purchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        System.out.println("The total purchase price is INR " + (unitPrice * quantity) +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}