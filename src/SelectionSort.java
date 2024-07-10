public class SelectionSort {

    public static void selectionSort(int[] arr, int size){

        for(int i=0; i<size-1; i++) {
            int min_idx = i;
            for(int j=i+1; j<size; j++){
                if(arr[j] < arr[min_idx]){

                    min_idx = j;

                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String args[]){

        int[] arr = {12, 7, 11, 98, 13, 5, 6};
        int size = arr.length;

        System.out.println("Original Array");
        printArray(arr);

        selectionSort(arr, size);

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
