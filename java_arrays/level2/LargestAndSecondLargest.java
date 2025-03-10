package java_arrays.level2;

import java.util.*;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0 && index < maxDigit) {
            digits[index++] = num % 10;
            num /= 10;
        }

        if (index == 0) {
            System.out.println("No digits found.");
            return;
        }

        int largest = digits[0];
        int secondLargest = -1;

        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not available"));
    }
}