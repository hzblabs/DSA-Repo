// Question

// Given an integer array nums, move all 0's to the end while maintaining the relative order of the non-zero elements.

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 6, 5, 0, 8, 2, 1 }; // An array of numbers

        int pos = 0; // Keeps track of the position to place the next non-zero value
        for (int i = 0; i<nums.length; i++) // Scans the array or iterate through the array
         {
            if (nums[i]!= 0) // Condition to check if a number in the array is not equal to 0
            {
                nums[pos] = nums[i]; // Place the current non-zero element at the next available position (starting from index 0)
                pos++; // Move to the next position to place the next non-zero element
            }  
        }

        while (pos<nums.length) // This loop is used to fill the remaining positions in the array with 0's
        {
            nums[pos] = 0; // Fill the remaining positions with 0's
            pos++; // Increase the index as you proceed in filling the remaining positions with 0's
        }

       System.out.println(Arrays.toString(nums)); // This prints the array in a readable format
        
    }
}