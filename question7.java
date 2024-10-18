// Reverse word in a string

import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence string: ");
        String input = scanner.nextLine();
        
        // Used StringBuilder to separate the words in the input string
        String[]words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Used a for loop to reverse the words in the input string and append them to the reversedString
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        System.out.println(reversedString);


    }
}
