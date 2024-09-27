package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

    public static List<Integer> findLeaders(int n, int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(0, arr[i]);
                maxFromRight = arr[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        List<Integer> leaders = findLeaders(n, arr);

        System.out.println("Leaders in the array are: " + leaders);
    }
}

