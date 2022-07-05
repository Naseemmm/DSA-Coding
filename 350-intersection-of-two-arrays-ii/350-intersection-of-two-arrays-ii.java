class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
         int [] ans=new int[n*m];
        int i=0,j=0,k=0;
        while(i<n&&j<m)
        {
            if(nums1[i]==nums2[j]){
                ans[k++]=nums1[i];
            i++;
                j++;}
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}