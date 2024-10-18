// Write bubble sort program and find O(n), time complexity, and space complexity

public class question5 {
    public static void main(String[] args) {
        // Sample array 
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        // Calling bubble sort function
        bubbleSort(arr);
        
        // Printing sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Function to implement Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if the current element is greater than the next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

