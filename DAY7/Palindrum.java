// Palindromic Array
// Difficulty: BasicAccuracy: 58.62%Submissions: 184K+Points: 1Average Time: 15m
// Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

// Examples:

// Input: arr[] = [111, 222, 333, 444, 555]
// Output: true
// Explanation:
// arr[0] = 111, which is a palindrome number.
// arr[1] = 222, which is a palindrome number.
// arr[2] = 333, which is a palindrome number.
// arr[3] = 444, which is a palindrome number.
// arr[4] = 555, which is a palindrome number.
// As all numbers are palindrome so This will return true.
// Input: arr[] = [121, 131, 20]
// Output: false
// Explanation: 20 is not a palindrome hence the output is false.



// class Solution {
//     public static boolean isPalinArray(int[] arr) {
//         // add code here.
        
//         for(int num : arr) {
//             int orig = num; 
//             int rev = 0;
            
//             while(num != 0) {
//                 int digit = num % 10;
//                 rev = rev * 10 + digit;
//                 num = num / 10;
//             }
            
//             if(orig != rev) {
//                 return false;
//             }
            
//         }
        
//         return true;
//     }
// }




