// Reverse string without using reverse command

import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        
        // for loop to reverse the string by appending each character in the input string
        for (int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }

        System.out.println("The reversed string is: " + reversed);
    }
    
}
