package arrays;

import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int[] arr) {
        ArrayList<Integer> maxNumList = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int a : arr) {
            if (a > max) {
                secondMax = max;
                max = a;
            } else if (a > secondMax && a < max) {
                secondMax = a;
            }
        }


        if (secondMax == Integer.MIN_VALUE) {
            secondMax = -1;
        }

        maxNumList.add(max);
        maxNumList.add(secondMax);

        return maxNumList;
    }

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 35};
        ArrayList<Integer> result = largestAndSecondLargest(arr.length, arr);

        System.out.println("Maximum: " + result.get(0));
        System.out.println("Second Maximum: " + result.get(1));
    }
}

