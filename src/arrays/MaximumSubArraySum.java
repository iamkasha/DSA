package arrays;

/*
Given an array arr[], the task is to find the elements of a contiguous subarray of numbers that has the largest sum.
*/
public class MaximumSubArraySum {

    public static void maxSumSubArr(int[] arr) {
        int maxSum = arr[0];
        int curSum = arr[0];
        int end = 0;

        for (int i = 1; i < arr.length; i++) {

            curSum = Math.max(curSum + arr[i], arr[i]);

            if (curSum > maxSum) {
                maxSum = curSum;
                end = i;
            }
        }

        int start = end;
        while (start >= 0) {
            maxSum -= arr[start];

            if (maxSum == 0) {
                break;
            }

            start--;
        }

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};

        maxSumSubArr(arr);
    }
}
