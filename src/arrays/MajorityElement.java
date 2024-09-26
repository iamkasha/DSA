package arrays;

/*
Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.
 */
public class MajorityElement {
    public static int majorityWins(int[] arr, int n, int x, int y) {
        // code here
        int freqOfX = 0;
        int freqOfY = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                freqOfX++;
            } else if (arr[i] == y) {
                freqOfY++;
            }
        }

        if (freqOfX == freqOfY) {
            return Math.min(x, y);
        } else {
            return freqOfX > freqOfY ? x : y;
        }
    }

    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        int[] arr = {1, 2, 3, 2, 3, 2, 4};
        int n = arr.length;
        int x = 2;
        int y = 3;

        // Calling majorityWins and printing the result
        int result = majorityWins(arr, n, x, y);
        System.out.println("Element with more appearances between " + x + " and " + y + " is: " + result);
    }

}
