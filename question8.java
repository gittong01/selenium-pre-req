// Convert roman number to integer number (Ex: Roman V -> 5, Roman XI -> 11)

import java.util.HashMap;
import java.util.Scanner;

public class question8 {
    
    public static int romanToInt(String s) {
        // map of Roman numerals and their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;  
        int n = s.length();

        // Loop through the string of Roman numerals
        for (int i = 0; i < n; i++) {
            int currentValue = romanMap.get(s.charAt(i));  // Get the integer value of current Roman character

            // If current value is less than the next value, subtract current value
            if (i + 1 < n && currentValue < romanMap.get(s.charAt(i + 1))) {
                total -= currentValue;
            } 
            // Otherwise, add the current value
            else {
                total += currentValue;
            }
        }

        return total; 
    }

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a Roman numeral: ");
        String romanInput = scanner.nextLine();
        
        // Convert the Roman numeral to an integer and print the result
        int result = romanToInt(romanInput);
        System.out.println("The integer value of " + romanInput + " is: " + result);
        
    }
}

