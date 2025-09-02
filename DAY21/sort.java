//------------sort color-------------

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

//------------1.bruthforce approch is -----------
// directlu use sort function buildin function------------





//------------OPtimize solution-----------
// class Solution {
//     public void sortColors(int[] nums) { // total -> t.c => O(n)
        
//       int len = nums.length;

//       int cnt0=0, cnt1=0, cnt2=0;

//       for(int i=0; i<len; i++) { // t.c => O(n)
//         if(nums[i] == 0) {
//             cnt0++;
//         } else if(nums[i] == 1) {
//             cnt1++;
//         } else {
//             cnt2++;
//         }
//       }



//       int idx = 0;
//       for(int i=0; i<cnt0; i++) { // t.c->O(n)
//         nums[idx++] = 0;
//       }

//       for(int i=0; i<cnt1; i++) {
//         nums[idx++] = 1;
//       }


//       for(int i=0; i<cnt2; i++) {
//         nums[idx++] = 2;
//       }
//     }
// }






//--------------3.optimal solution--------------
