// Search a 2D Matrix
// You are given an m x n 2-D integer array matrix and an integer target.
// Each row in matrix is sorted in non-decreasing order.
// The first integer of every row is greater than the last integer of the previous row.
// Return true if target exists within matrix or false otherwise.
// Can you write a solution that runs in O(log(m * n)) time?
// Example 1: Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
// Output: true

package Searchalgorithms;

public class twodimnmatrix {

    public static void main(String[] args) {

        twodimnmatrix a = new twodimnmatrix();
        int[][] matrix = { { 1, 2, 4, 8 }, { 10, 11, 12, 13 }, { 14, 20, 30, 40 } };
        int target = 70;
        boolean result = a.tmatrix(matrix, target);
        System.out.println("The target value is in the matrix: " + result);
    }

    public boolean tmatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;
            int midval = matrix[row][col];

            if (midval == target) {
                return true;
            } else if (midval < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

}
