import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        // Handle zero as a special case
        if (n == 0) {
            count = 1;
        } else {
            // Handle negative numbers by taking the absolute value
            n = Math.abs(n);
        }
        while(n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}

// The problem: The code correctly counts the number of digits in a given integer.