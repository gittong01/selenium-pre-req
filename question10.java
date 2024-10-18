//Program to find occurence of number 

import java.util.HashMap;
import java.util.Scanner;

public class question10 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // array to store the numbers
        int[] arr = new int[n];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // method to find and print occurrences
        findOccurrences(arr);
    }

   
    public static void findOccurrences(int[] arr) {
        // HashMap to store the number and its occurrences
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();

        // go through the array and count the occurrences
        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        // Print the occurrences of each number
        for (Integer key : occurrenceMap.keySet()) {
            System.out.println(key + " → Occurred " + occurrenceMap.get(key) + " time" + (occurrenceMap.get(key) > 1 ? "s" : ""));
        }
    }
}
