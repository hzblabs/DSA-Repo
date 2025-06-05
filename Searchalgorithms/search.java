//Search in Rotated Sorted Array
//You are given an array of length n which was originally sorted in ascending order. It has now been rotated between 1 and n times. 
//For example, the array nums = [1,2,3,4,5,6] might become: [3,4,5,6,1,2] if it was rotated 4 times.
//[1,2,3,4,5,6] if it was rotated 6 times.
//Given the rotated sorted array nums and an integer target, 
//return the index of target within nums, or -1 if it is not present.
//You may assume all elements in the sorted rotated array nums are unique

package Searchalgorithms;

public class search {
    public static void main(String[] args) {
        search a = new search();
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int result = a.srch(nums, 6);
        System.out.print("Index of target is: " + result);

    }

    public int srch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                target = i;
                return target;
            }
        }
        return -1;
    }

}
