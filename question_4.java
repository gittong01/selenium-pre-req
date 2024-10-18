// Swap two variables without using the third variable

import java.util.Scanner;
public class question_4 {
    public static void main(String[] args) {
        
        // Scanner to take in user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Sum of a and b is stored into a
        a = a + b;
        // Original value of a is assigned to b
        b = a - b;
        // Original value of b is assigned to a
        a = a - b;

        System.out.println("After swapping the two variables, the first number is: " + a + " and the second number is: " + b);

    }
    
}
