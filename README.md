# january18_2025
The problems that I solved today

1.You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once). Return the bitwise XOR of all integers in nums3.

Code:
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res=0,i,j,n=nums1.length,m=nums2.length;
        for(i=0;i<n;i++)
        {
            if(m%2==1)
                res^=nums1[i];
        }
        for(i=0;i<m;i++)
        {
            if(n%2==1)
                res^=nums2[i];
        }
        return res;
    }
}

2.A 0-indexed array derived with length n is derived by computing the bitwise XOR (⊕) of adjacent values in a binary array original of length n. Specifically, for each index i in the range [0, n - 1]: If i = n - 1, then derived[i] = original[i] ⊕ original[0]. Otherwise, derived[i] = original[i] ⊕ original[i + 1]. Given an array derived, your task is to determine whether there exists a valid binary array original that could have formed derived. Return true if such an array exists or false otherwise. A binary array is an array containing only 0's and 1's

Code:
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int x:derived)
            xor^=x;
        return xor==0;
    }
}
