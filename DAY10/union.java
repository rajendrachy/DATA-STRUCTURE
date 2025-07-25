// Union of Arrays with Duplicates
// Difficulty: EasyAccuracy: 42.22%Submissions: 449K+Points: 2Average Time: 10m
// You are given two arrays a[] and b[], return the Union of both the arrays in any order.

// The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.

// Note: Elements of a[] and b[] are not necessarily distinct.
// Note that, You can return the Union in any order but the driver code will print the result in sorted order only.

// Examples:

// Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
// Output: [1, 2, 3]
// Explanation: Union set of both the arrays will be 1, 2 and 3.
// Input: a[] = [1, 2, 3], b[] = [4, 5, 6] 
// Output: [1, 2, 3, 4, 5, 6]
// Explanation: Union set of both the arrays will be 1, 2, 3, 4, 5 and 6.
// Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
// Output: [1, 2]
// Explanation: Union set of both the arrays will be 1 and 2.




// class Solution {
//     public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//         // code here
        
        
//          Set<Integer> unionSet = new HashSet<>();

//         // Add all elements from array a
//         for (int num : a) {
//             unionSet.add(num);
//         }

//         // Add all elements from array b
//         for (int num : b) {
//             unionSet.add(num);
//         }

//         // Convert set to list
//         return new ArrayList<>(unionSet);
//     }
// }