// Convert digits to string

import java.util.Scanner;

public class question_9 {

    // Arrays to store words for numbers
    private static final String[] ones = { 
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
        "eighteen", "nineteen"
    };
    
    private static final String[] tens = { 
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };


    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        return convert(number);
    }

    // if statement to convert a number to words
    private static String convert(int number) {
        if (number < 20) {
            return ones[number];  // Handle numbers less than 20
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + ones[number % 10] : "");
        } else {
            return ones[number / 100] + " hundred" + 
                (number % 100 != 0 ? " and " + convert(number % 100) : "");
        }
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number between 0 and 999: ");
        int number = scanner.nextInt();

        // Convert the inputs to words
        if (number >= 0 && number <= 999) {
            System.out.println("Number in words: " + convertToWords(number));
        } else {
            System.out.println("Number out of range.");
        }

    }
}

    
