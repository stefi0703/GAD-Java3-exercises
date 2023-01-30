package org.example.LeetCode34;

public class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        //[5,7,7,8,8,8,8,8,8,8,8,8,8,8,10]
        int[] result = new int[2];
        result[0] = first(nums, target);
        result[1] = last(nums, target);

        return result;
    }

    public static int first(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target && nums[mid - 1] < target) {
                return mid;
            } else if (nums[mid] == target) {
                right = mid - 1;
            }

            if(nums[mid] > target) {
                right = mid - 1;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static int last(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target && nums[mid + 1] > target) {
                return mid;
            } else if (nums[mid] == target) {
                left = mid + 1;
            }

            if(nums[mid] > target) {
                right = mid - 1;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }
}
