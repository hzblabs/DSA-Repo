//Question
// Given an integer array nums, return all the triplets
// [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0,
// and the indices i, j and k are all distinct.
// The output should not contain any duplicate triplets. 
// You may return the output and the triplets in any order.
// Example 1:
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> result = ts.threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);
    }
    
    
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> arr = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++){
            for (int j = i + 1; j<nums.length; j++){
                for (int k = j + 1; k<nums.length; k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> added = Arrays.asList(nums[i], nums[j], nums[k]);
                        arr.add(added);
                    }

                }
            }
        }
        return new ArrayList<>(arr); 
    }
}
