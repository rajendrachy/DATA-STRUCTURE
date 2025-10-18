//---------------Container with most water-------------------

// package DAY20;

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 


// class Solution {
//     public int maxArea(int[] height) { // TC -> O(n)
//         int maxWater = 0; // ans
//         int lp = 0;
//         int rp = height.length - 1;

//         while(lp < rp) {
//             int w = rp - lp;
//             int ht = Math.min(height[lp], height[rp]);
//             int currWater = w * ht;

//             maxWater = Math.max(maxWater, currWater);
//             if (height[lp] < height[rp]) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }

//         return maxWater;

//     }
// }

