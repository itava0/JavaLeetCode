package Arrays_Hashing;

//Given an integer array nums, return an array answer such
// that answer[i] is equal to the product of all the elements of
// nums except nums[i].
//
//The product of any prefix or suffix of nums is
// guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and
// without using the division operation.

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        ProductExceptSelf answer = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        answer.productExceptSelf(nums);
    }
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            System.out.println("Left");
            System.out.println(left);
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            System.out.println("Right");
            System.out.println(right);
            right *= nums[i];
        }

        System.out.println("Output");
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
