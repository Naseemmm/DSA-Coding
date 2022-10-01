class Solution {
    public int trap(int[] height) {
        int[] p=new int[height.length];
        int[] s=new int[height.length];
        int sum=0;
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            max=Math.max(max,height[i]);
            p[i]=max;
        }
        max=0;
        for(int i=height.length-1;i>=0;i--)
        {
            max=Math.max(max,height[i]);
            s[i]=max;
        }
        for(int i=0;i<height.length;i++)
        {
            sum+=(Math.min(p[i],s[i])-height[i]);
        }
        return sum;
    }
}