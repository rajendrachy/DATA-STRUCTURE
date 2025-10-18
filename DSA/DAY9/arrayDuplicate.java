// // Array Duplicates
// // Difficulty: EasyAccuracy: 18.95%Submissions: 841K+Points: 2Average Time: 20m
// // Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

// // Note: You can return the elements in any order but the driver code will print them in sorted order.

// // Examples:

// // Input: arr[] = [2, 3, 1, 2, 3]
// // Output: [2, 3] 
// // Explanation: 2 and 3 occur more than once in the given array.
// // Input: arr[] = [3, 1, 2] 
// // Output: []
// // Explanation: There is no repeating element in the array, so the output is empty.
// // Constraints:




// class Solution {
//     public ArrayList<Integer> findDuplicates(int[] arr) {
//         // code here
    
//        int n = arr.length;
//        int[] f = new int[1000001];
//        ArrayList<Integer> res = new ArrayList<>();
       
       
//        for(int i=0; i<n; i++) {
//            f[arr[i]]++;
//        }
       
//        for(int i=0; i<n; i++) {
//            if(f[arr[i]] > 1) {
//                res.add(arr[i]);
//                f[arr[i]] = 0;
//            }
//        }
       
       
//        return res;
//     }
// }






