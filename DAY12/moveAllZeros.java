// Move All Zeroes to End
// Difficulty: EasyAccuracy: 45.51%Submissions: 360K+Points: 2Average Time: 15m
// You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

// Examples:

// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.
// Input: arr[] = [10, 20, 30]
// Output: [10, 20, 30]
// Explanation: No change in array as there are no 0s.
// Input: arr[] = [0, 0]
// Output: [0, 0]
// Explanation: No change in array as there are all 0s.




// // User function Template for Java

// import java.util.Arrays;

// class Solution {
//     void pushZerosToEnd(int[] arr) {
//         // code here
//          int n = arr.length;
//         List<Integer> res = new ArrayList<>();

//         // Add non-zero elements to res
//         for (int num : arr) {
//             if (num != 0) {
//                 res.add(num);
//             }
//         }

//         // Add zeros to res
//         while (res.size() < n) {
//             res.add(0);
//         }

//         // Copy res back to arr
//         for (int i = 0; i < n; i++) {
//             arr[i] = res.get(i);
//         }
//     }
// }


