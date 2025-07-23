// Array Leaders
// Difficulty: EasyAccuracy: 29.94%Submissions: 898K+Points: 2Average Time: 15m
// You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

// Examples:

// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 2]
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
// Input: arr = [10, 4, 2, 4, 1]
// Output: [10, 4, 4, 1]
// Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
// Input: arr = [5, 10, 20, 40]
// Output: [40]
// Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
// Input: arr = [30, 10, 10, 5]
// Output: [30, 10, 10, 5]
// Explanation: When an array is sorted in non-increasing order, all elements are leaders.
// Constraints:
// 1 <= arr.size() <= 106
// 0 <= arr[i] <= 106

// Expected Complexities
// Company Tags
// PayuAdobe

// class Solution {
//     static ArrayList<Integer> leaders(int arr[]) {
//         // code here
//          ArrayList<Integer> result = new ArrayList<>();
//         int n = arr.length;
//         int max = arr[n - 1];

//         // Insert last element first
//         result.add(0, max);

//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] >= max) {
//                 max = arr[i];
//                 result.add(0, max); // Add at beginning
//             }
//         }

//         return result;
       
//     }
// }















//--------------without arraylist--------------------
// class Solution {
//     static int[] leaders(int arr[]) {
//         int n = arr.length;
//         int[] temp = new int[n]; // Temporary array to store leaders
//         int count = 0;           // To count number of leaders

//         int max = arr[n - 1];
//         temp[count++] = max;     // Last element is always a leader

//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] >= max) {
//                 max = arr[i];
//                 temp[count++] = max;
//             }
//         }

//         // Reverse the leaders to get them in original order
//         int[] result = new int[count];
//         for (int i = 0; i < count; i++) {
//             result[i] = temp[count - 1 - i];
//         }

//         return result;
//     }
// }
