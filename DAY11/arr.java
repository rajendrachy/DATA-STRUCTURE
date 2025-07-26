// Two Sum - Pair with Given Sum
// Difficulty: EasyAccuracy: 30.61%Submissions: 396K+Points: 2Average Time: 20m
// Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

// Examples:

// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true
// Explanation: arr[3] + arr[4] = -3 + 1 = -2
// Input: arr[] = [1, -2, 1, 0, 5], target = 0
// Output: false
// Explanation: None of the pair makes a sum of 0
// Input: arr[] = [11], target = 11
// Output: false
// Explanation: No pair is 

// class Solution {
//     boolean twoSum(int arr[], int target) {
//         // code here
//          HashSet<Integer> seen = new HashSet<>();

//         for (int num : arr) {
//             int complement = target - num;
//             if (seen.contains(complement)) {
//                 return true;
//             }
//             seen.add(num);
//         }

//         return false;
//     }
// }

