package arrays;

/*
Given an array a[] of N integers, the task is to find the length of the longest Alternating Even Odd subarray present in the array.
*/
public class LongestEvenOddSubArr {


    static int maxEvenOdd(int[] arr, int n) {

        int prevRem = arr[0] % 2;
        int maxLength = 0;
        int curLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != prevRem) {
                curLength++;
            } else {
                curLength = 1;
            }

            if (curLength > maxLength) {
                maxLength = curLength;
            }

            prevRem = arr[i] % 2;
        }
        return maxLength;
    }

    static public void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 7, 2, 9, 4};

        int n = arr.length;
        System.out.print(
                "Length of longest subarray of even and odds is : ");
        System.out.print(maxEvenOdd(arr, n));
    }
}
