

// Reverse array in groups
// Difficulty: BasicAccuracy: 37.48%Submissions: 354K+Points: 1Average Time: 15m
// Given an array arr[] of positive integers. Reverse every sub-array group of size k.
// Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't return any array, modify the given array in place.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5], k = 3
// Output: [3, 2, 1, 5, 4]
// Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
// Input: arr[] = [5, 6, 8, 9], k = 5
// Output: [9, 8, 6, 5]
// Explnation: Since k is greater than array size, the entire array is reversed.
// Constraints:
// 1 ≤ arr.size(), k ≤ 105
// 1 ≤ arr[i] ≤ 105

// Expected Complexities
// Company Tags
// Adobe
// Topic Tags
// Related Interview Experiences
// Related Articles public void reverseInGroups(int[] arr, int k) {
//         // code here
        
//     }






//-------------code ans----------------------------
// public void reverseInGroups(int[] arr, int k) {
//     int n = arr.length;
    
//     for (int i = 0; i < n; i += k) {
//         // Set the start and end of the current group
//         int left = i;
//         int right = Math.min(i + k - 1, n - 1);
        
//         // Reverse the current group
//         while (left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//     }
// }