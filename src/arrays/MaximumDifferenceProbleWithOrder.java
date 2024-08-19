package arrays;

public class MaximumDifferenceProbleWithOrder {
    public int maxDifference(int arr[], int n){
        int max_diff = arr[1] - arr[0];
        int min_ele = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] - min_ele > max_diff){
                max_diff = arr[i] - min_ele;
            }
            if(arr[i] < min_ele){
                min_ele = arr[i];
            }
        }
        return max_diff;
    }
    public static void main(String[] args) {
        MaximumDifferenceProbleWithOrder maxDiff = new MaximumDifferenceProbleWithOrder();
        int arr[] = new int[]{33,1, 2, 3, 10, 6, 20, 8, 1};
        System.out.println(maxDiff.maxDifference(arr, arr.length));
    }
}
