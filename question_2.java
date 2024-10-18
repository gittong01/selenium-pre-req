// Write Java Program to find factorial of a number

import java.util.Scanner;
public class question_2 {
    public static void main(String[] args) {
        
        // Scanner to take in user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        // Declare the variables and used a while loop for the factorial
        int number = scanner.nextInt();
        int i = 1, fact = 1;
        while(i <= number){
            fact = fact * i;
            i++;
        }
    
        System.out.println("The Factorial of the number is: " + fact);
    }
}
