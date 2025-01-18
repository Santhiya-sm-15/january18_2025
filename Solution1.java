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