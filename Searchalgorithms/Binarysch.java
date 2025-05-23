package Searchalgorithms;

public class Binarysch {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 99; i++) {
            array[i] = i;
        }
        int target = 68;
        int result = binarysearch(array, target);
        System.out.println("Vlaue is at index " + result);
        
    }
    
    public static int binarysearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int value = array[middle];

            if (value < target)
                left = middle + 1;
            else if (value > target)
                right = middle - 1;
            else
                return middle;
        }
        return -1;
    }
}
