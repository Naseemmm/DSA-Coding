class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=2*n;
        int x=0,y=n;
        int[] ans=new int[len];
        int i=0;
        while(i<len){
            ans[i++]=nums[x++];
            ans[i++]=nums[y++];
        }
        return ans;
        
    }
}