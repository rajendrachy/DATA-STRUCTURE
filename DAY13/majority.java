




// 169. Majority Element
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 




// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums); 
//         int len = nums.length;
//         int maj = len / 2;

//         int cnt = 1;
//         int res = nums[0];
//         for(int i=1; i<len; i++) {
//                if(nums[i] == nums[i-1]) {
//                 cnt++;
//                } else {
//                 cnt = 1;
//                }


//                if(cnt > maj) {
//                  return nums[i];
                
//                } 
//         }

//           if(cnt > maj) {
//                  return res;
                
//                } 
//       return -1;

//     }
// }


