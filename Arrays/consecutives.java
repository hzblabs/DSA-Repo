// Question:
//  Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

import java.util.Arrays;
public class consecutives {

    public static void main(String[] args) {
        int[] nums = {100, 63, 200, 65, 64, 62};
        consecutives c = new consecutives();
        System.out.println(c.longestConsecutive(nums)); // Output: 4
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int currentstreak = 1;

        for (int i = 1; i<nums.length; i++){
            if (nums[i] == nums[i -1]){
                continue;
            }
            if (nums[i] == (nums[i -1]) +1){
                currentstreak++;
            }
            else {
                longest = Math.max(longest, currentstreak);
                currentstreak = 1;
            }
        }
        return Math.max(longest, currentstreak);
    }
    
}
