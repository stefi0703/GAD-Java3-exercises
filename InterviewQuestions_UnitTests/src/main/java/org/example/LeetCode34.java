package org.example;

public class LeetCode34 {

        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            result[0]=first(nums,target);
            result[1]=last(nums,target);
            return result;

        }
        public static int first(int[] nums,int target){
            int left = 0;
            int right = nums.length-1;
            while(left <= right){
                int mid = (left+right)/2;
                System.out.println("mid="+mid);
                if(nums[mid]==target&&(mid==0||nums[mid-1]<target))
                    return mid;
                else if(nums[mid]==target){
                    right=mid-1;
                }
                if(nums[mid]>target){
                    right = mid - 1;
                }
                if(nums[mid]<target){
                    left = mid+1;
                }
            }
            return -1;
        }
        public static int last(int[] nums,int target){
            int left = 0;
            int right = nums.length-1;

            while(left <= right){
                int mid = (left+right)/2;
                if(nums[mid]==target&&((mid==nums.length-1)||(nums[mid+1]>target)))
                    return mid;
                else if(nums[mid]==target){
                    left=mid+1;
                }
                if(nums[mid]>target){
                    right = mid - 1;
                }
                if(nums[mid]<target){
                    left = mid+1;
                }
            }
            return -1;
        }
    }

