// Find Minimum in Rotated Sorted Array
// You are given an array of length n which was originally sorted in ascending order. 
// It has now been rotated between 1 and n times. 
// For example, the array nums = [1,2,3,4,5,6] might become: [3,4,5,6,1,2] if it was rotated 4 times.
// [1,2,3,4,5,6] if it was rotated 6 times.
// Notice that rotating the array 4 times moves the last four elements of the array to the beginning. 
// Rotating the array 6 times produces the original array.
// Assuming all elements in the rotated sorted array nums are unique, return the minimum element of this array.

package Searchalgorithms;

public class rotatedarraysrch {
    public static void main(String[] args) {
        rotatedarraysrch a = new rotatedarraysrch();
        int[] nums = { 4, 5, 6, 1, 2, 3 };
        int result = a.findMin(nums);
        System.out.println("Minimum is: " + result);

    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            right = mid;
        }
        return nums[left];
    }

}
