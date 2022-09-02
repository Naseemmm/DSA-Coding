class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int a[]=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++)
        { 
            
            for(int j=0;j<nums2.length;j++)
                
            {
                if(nums1[i]==nums2[j])
            {
                    for(int z=j;z<nums2.length;z++)
            {
                
                if(nums1[i]<nums2[z])
                {
                    a[i]=nums2[z];
                    break;
                }
                else
                    a[i]=-1;
            }
                }
            }
        }
        return a;
    }
}