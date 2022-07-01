import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] s=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            s[nums[i]]++;
        }
        for(int i=1;i<101;i++)
        {
            s[i]=s[i]+s[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            int pos=nums[i];
            if(pos==0)
            {
              nums[i]=0;  
            }
            else
            {
                nums[i]=s[pos-1];
            }
        }
        return nums;
    }
}