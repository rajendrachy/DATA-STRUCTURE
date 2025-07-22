// First and Second Smallests
// Difficulty: BasicAccuracy: 24.44%Submissions: 141K+Points: 1
// Given an array, arr[] of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

// Examples:

// Input: arr[] = [2, 4, 3, 5, 6]
// Output: [2, 3] 
// Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
// Input: arr[] = [1, 1, 1]
// Output: [-1]
// Explanation: Only element is 1 which is smallest, so there is no second smallest element.






// import java.util.ArrayList;

// class Solution {
//     public ArrayList<Integer> minAnd2ndMin(int[] arr) {
//         // code here
        
//        int min1 = arr[0];
//         int min2 = Integer.MAX_VALUE;

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min1) {
//                 min2 = min1;
//                 min1 = arr[i];
//             } else if (arr[i] > min1 && arr[i] < min2) {
//                 min2 = arr[i];
//             }
//         }

//         ArrayList<Integer> result = new ArrayList<>();
//         if (min2 == Integer.MAX_VALUE) {
//             result.add(-1);
//         } else {
//             result.add(min1);
//             result.add(min2);
//         }

//         return result;
        
//     }
// }



