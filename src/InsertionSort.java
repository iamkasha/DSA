public class InsertionSort {

    public static void insertionSort(int[] arr, int size){
        for(int i=1; i<size; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String args[]){

        int[] arr = {12, 7, 11, 98, 13, 5, 6};
        int size = arr.length;

        System.out.println("Original Array");
        printArray(arr);

        insertionSort(arr, size);

        System.out.println("Sorted Array");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
