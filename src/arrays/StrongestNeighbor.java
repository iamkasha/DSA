package arrays;

class StrongestNeighbour {
    static void maximumAdjacent(int sizeOfArray, int[] arr) {
        for (int i = 0; i < sizeOfArray - 1; i++) {
            System.out.print(Math.max(arr[i], arr[i + 1]) + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int size = arr.length;

        System.out.println("Maximum of adjacent pairs:");
        maximumAdjacent(size, arr);
    }
}
