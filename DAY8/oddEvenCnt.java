// Count Odd and Even
// Difficulty: BasicAccuracy: 37.44%Submissions: 113K+Points: 1
// Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.

// Note: Return two elements where the first one in the count of odd & second one is the count of even.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: 3 2
// Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
// Input: arr[] = [1, 1]
// Output: 2 0
// Explanation: There are 2 odd elements (1, 1) and no even elements.
// Constraints:
// 1 <= arr.size <= 106
// 1 <= arr[i] <= 106




// class Solution {
//     public int[] countOddEven(int[] arr) {
//         // Code here
        
//         int n = arr.length;
        
//         int oddCnt = 0;
//         int evenCnt = 0;
        
//         for(int i=0; i<n; i++) {
//             if(arr[i] % 2 != 0) {
//                 oddCnt++;
//             } else {
//                 evenCnt++;
//             }
//         }
        
//         return new int []{oddCnt, evenCnt};
//     }
// }

