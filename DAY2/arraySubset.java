// Array Subset
// Difficulty: BasicAccuracy: 44.05%Submissions: 451K+Points: 1Average Time: 20m
// Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

// Examples:

// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
// Output: true
// Explanation: b[] is a subset of a[]
// Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
// Output: true
// Explanation: b[] is a subset of a[]
// Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
// Output: false
// Explanation: b[] is not a subset of a[]
// Constraints:
// 1 <= a.size(), b.size() <= 105
// 1 <= a[i], b[j] <= 106

// Expected Complexities
// Company Tags
// AccoliteQualcommGE
// Topic Tags
// ArraysSearchingHashBinary SearchData StructuresAlgorithms
// Related Interview Experiences
// Related Articles






import java.util.Arrays;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         // Step 1: Sort both arrays
        Arrays.sort(a); // sort in ascending order
        Arrays.sort(b);

        int i = 0; // pointer for a[]
        int j = 0; // pointer for b[]

        // Step 2: Traverse both arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] == b[j]) {
                i++;
                j++;
            } else {
                // b[j] not found in a[]
                return false;
            }
        }

        // Step 3: If we traversed all elements of b[], it's a subset
        return j == b.length;
    }
}







// ✅ Input:

// a[] = [11, 7, 1, 13, 21, 3, 7, 3]
// b[] = [11, 3, 7, 1, 7]
// ✅ Step 1: Sort both arrays

// Sorted a[] = [1, 3, 3, 7, 7, 11, 13, 21]
// Sorted b[] = [1, 3, 7, 7, 11]
// We sort both so we can do linear comparison.

// ✅ Step 2: Initialize pointers
// i = 0 → pointing to a[]

// j = 0 → pointing to b[]

// ✅ Step 3: Traverse with two pointers
// i	a[i]	j	b[j]	Comparison	Action
// 0	1	0	1	a[i] == b[j]	i++, j++ → 1,1
// 1	3	1	3	a[i] == b[j]	i++, j++ → 2,2
// 2	3	2	7	a[i] < b[j]	i++ → 3
// 3	7	2	7	a[i] == b[j]	i++, j++ → 4,3
// 4	7	3	7	a[i] == b[j]	i++, j++ → 5,4
// 5	11	4	11	a[i] == b[j]	i++, j++ → 6,5

// ✅ Final check:
// j == b.length (5) → All elements in b[] matched in a[].

// ✅ Output:
// true


