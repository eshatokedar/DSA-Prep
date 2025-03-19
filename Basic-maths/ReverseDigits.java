import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int reversed = 0;

        // Handle negative numbers by storing the sign and working with the absolute value
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        while(n > 0) {
            int digit = n % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n = n / 10; // Remove the last digit
        }

        // Apply the original sign to the reversed number
        reversed *= sign;

        System.out.println(reversed);
    }
}

// The problem: Given an integer, reverse the digits of the number.
// For example, if the input is 123, the output should be 321.

