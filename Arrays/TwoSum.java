// Question
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 7, 9 }; // This creates an array of integers.
        int target = 200; // This creates an integer target. The target is the sum we want to find in the array.

        int[] result = twosum(nums, target); // This calls the twosum method and passes the array and target as arguments.
        if (result != null) {
            System.out.println("indices are: " + result[0] + ", " + result[1]);
        } 
        else {
                System.out.println("No available indices");
            }
        
    }
    
    private static int[] twosum(int[] nums, int target) //This creates a method that takes an array of integers and an integer target as input and returns an array of two integers.
    { 
        for (int i = 0; i < nums.length; i++) // This iterates through the array of integers.
        {
            for (int j = i + 1; j < nums.length; j++) // This iterates through the array of integers starting from the next index of i.
            {
                if (nums[i] + nums[j] == target) // This checks if the sum of the two integers at indices i and j is equal to the target.
                {

                    {
                        return new int[] { i, j }; // If the condition is met, it returns an array containing the indices i and j.
                        // This means that the two integers at these indices add up to the target.
                    }
                }
            }

        }
        return null; // If no such indices are found, it returns null.
    }
}