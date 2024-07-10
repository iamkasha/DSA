import java.util.Arrays;

public class MajorityElement {
        public static int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            return nums[n/2];
        }

        public static void main(String args[]){
            int[] arr = {3,2,3};
            int[] arr1 = new int[]{1,2,3,8,3,0,3,4,4,4,4};
            System.out.println(majorityElement(arr1));
        }
}
