// Question: 
// Implement a linear search algorithm

package Searchalgorithms;

public class Linearsch {
  
    public static void main(String[] args) {
        int[] array = { 3, 5, 6, 7, 4, 1, 9, 2, 8 }; // Declare and initialize an array of integers

        int index = linearsch(array, 10); // Call the linearsch method to search for the value 10 in the array

        if (index != -1) {
            System.out.println("Element found at index " + index); // Print the index if the element is found
        }
        else {
            System.out.println("Element not found"); // Print a message if the element is not found
        }
    }

    private static int linearsch(int[] array, int value) { // Method to perform linear search on the array
        for (int i = 0; i < array.length; i++) { // Loop through each element in the array
            if (array[i] == value) { // Check if the current element matches the value being searched for
                return i; // Return the index of the matching element
            }
        }
        return -1; // Return -1 if the value is not found in the array
    }
}