package arrays;

public class MinConsecutiveFlips {


    public static int minFlips(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int zerosGrpCnt = 0;
        int onesGrpCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] == 0) {
                    zerosGrpCnt++;
                } else {
                    onesGrpCnt++;
                }
            } else {
                if (arr[i] != arr[i - 1]) {
                    if (arr[i] == 0) {
                        zerosGrpCnt++;
                    } else {
                        onesGrpCnt++;
                    }
                }
            }
        }
        return Math.min(zerosGrpCnt, onesGrpCnt);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1, 1, 0};
        int[] arr2 = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1};

        int result1 = minFlips(arr1);
        int result2 = minFlips(arr2);

        System.out.println("Minimum flips required: " + result1);
        System.out.println("Minimum flips required: " + result2);
    }
}
