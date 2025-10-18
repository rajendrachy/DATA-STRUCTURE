// Rotating an Array
// Difficulty: BasicAccuracy: 44.48%Submissions: 122K+Points: 1Average Time: 20m
// Given an array arr[]. The task is to rotate the array by d elements where d ≤ arr.size.

// Examples:

// Input: arr[] = [-1, -2, -3, 4, 5, 6, 7], d = 2
// Output: [-3, 4, 5, 6, 7, -1, -2]
// Explanation: 
// Rotate by 1: [-2, -3, 4, 5, 6, 7, -1]
// Rotate by 2: [-3, 4, 5, 6, 7, -1, -2]
// Input: arr[] = [1, 3, 4, 2], d = 3 
// Output: [2, 1, 3, 4]
// Explanation: After rotating the array three times, the first three elements shift one by one to the right.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ arr.size ≤ 106
// -109 ≤ arr[i] ≤ 109
// 0 ≤ d ≤ arr.size

// Company Tags
// Codenation
// Topic Tags




// User function Template for Java

// class Solution {
//     void leftRotate(int arr[], int d) {
//         // code here
//          int n = arr.length;
//         d = d % n; // Handle cases where d > n

//         reverse(arr, 0, d - 1);       // Reverse the first d elements
//         reverse(arr, d, n - 1);       // Reverse the remaining elements
//         reverse(arr, 0, n - 1);       // Reverse the entire array
//     }

//     private void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }



