public class BubbleSort {
        public static void bubbleSort(int[] arr, int size){
            for(int i=0; i<size-1; i++) {
                for(int j=0; j<size-i-1; j++){
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }

    public static void main(String args[]){

        int[] arr = {12, 7, 11, 98, 13, 5, 6};
        int size = arr.length;

        System.out.println("Original Array");
        printArray(arr);

        bubbleSort(arr, size);

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
