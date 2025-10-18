// Value equal to index value
// Difficulty: BasicAccuracy: 54.83%Submissions: 232K+Points: 1Average Time: 20m
// Given an array arr. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

// Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

// Examples:

// Input: arr[] = [15, 2, 45, 4 , 7]
// Output: [2, 4]
// Explanation: Here, arr[2] = 2 exists here and arr[4] = 4 exists here.
// Input: arr[] = [1]
// Output: [1]
// Explanation: Here arr[1] = 1 exists.






// class Solution {
//     public List<Integer> valueEqualToIndex(List<Integer> nums) {
//         // code here
//          List<Integer> result = new ArrayList<>();

//     for (int i = 0; i < nums.size(); i++) {
//         if (nums.get(i) == i + 1) {
//             result.add(i + 1); // 1-based index
//         }
//     }

//     return result;
//     }
//   }


