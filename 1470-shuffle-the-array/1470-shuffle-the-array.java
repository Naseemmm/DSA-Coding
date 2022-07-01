class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] a = new int[2*n];
        int x=0;
        int y=n;
        int i=0;
       while(i<2*n){
            a[i++]=nums[x++];
            a[i++]=nums[y++];
        }
        return a;
        
    }
}