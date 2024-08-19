package arrays;

public class  LeadersInArray {
    private void printLeaders(int[] arr, int n) {
        int i=n-2;
        int maxEle = arr[n-1];
        System.out.print(maxEle + " ");
        while(i >= 0){
            if(arr[i] > maxEle){
                System.out.print(arr[i] + " ");
                maxEle = arr[i];
            }
            i--;
        }
    }
    public static void main(String[] args)
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
