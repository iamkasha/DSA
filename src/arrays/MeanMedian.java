package arrays;

import java.util.Arrays;

class MeanMedian {
    public int median(int[] A, int N) {
        Arrays.sort(A);

        if (N % 2 != 0) {
            return A[N / 2];
        } else {
            return (A[N / 2] + A[N / 2 - 1]) / 2;
        }
    }
    public int mean(int A[], int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        return sum / N;
    }

    public static void main(String[] args) {
        MeanMedian meanMedian = new MeanMedian();

        int[] arr = {12, 5, 7, 3, 8};

        int medianValue = meanMedian.median(arr, arr.length);
        System.out.println("Median: " + medianValue);

        int meanValue = meanMedian.mean(arr, arr.length);
        System.out.println("Mean: " + meanValue);
    }
}

