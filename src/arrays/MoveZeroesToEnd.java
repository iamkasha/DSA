package arrays;

public class MoveZeroesToEnd {

    public static void moveZeores(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int j = count; j<n; j++){
            arr[j] = 0;
        }

        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 0, 0, 3, 6};
        int[] arr2 = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        moveZeores(arr1);

        System.out.println("---------------------");

        moveZeores(arr2);
    }

}
