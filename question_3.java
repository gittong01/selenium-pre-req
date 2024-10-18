// Write Java Program to find the first big, second big, and third-biggest number (Take user input, use scanner function)

import java.util.Scanner;
public class question_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        // if statement to see if the first number is the biggest
        if (a > b && a > c)
        {
            int first = a;

            if (b > c) {
                int second = b;
                int third = c;
                System.out.println("The first biggest number is: " + first + " The second biggest number is: " + second + " The third biggest number is: " + third);
            }
            else {
                int second = c;
                int third = b;
                System.out.println("The first biggest number is: " + first + " The second biggest number is: " + second + " The third biggest number is: " + third);
            }

        
        }
        // if the second number is the biggest
        else if (b > a && b > c)
        {
            int first = b;

            if (a > c) {
                int second = a;
                int third = c;
                System.out.println("The first biggest number is: " + first + " The second biggest number is: " + second + " The third biggest number is: " + third);
            }
            else{
                int second = c;
                int third = a;
                System.out.println("The first biggest number is: " + first + " The second biggest number is: " + second + " The third biggest number is: " + third);
            }
        }
        // if the third number is the biggest
        else 
        {
            int first = c;

            if (a > b) {
                int second = a;
                int third = b;
                System.out.println("The first biggest number is: " + first + " The second biggest number is: " + second + " The third biggest number is: " + third);
            }
            else {
                int second = b;
                int third = a;
                System.out.println("The first biggest number is: " + first + " The second biggest number is: " + second + " The third biggest number is: " + third);
            }

        }

    }
}
