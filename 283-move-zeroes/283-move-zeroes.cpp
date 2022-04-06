class Solution {
public:
    void moveZeroes(vector<int>& nums) {
       int n=nums.size();
        int left=0;int right=0;
       if(n==0){
           return;
       }
        while(right<nums.size()){
        if(nums[right]==0){
            right++;
        }
        else{
      swap(nums[left],nums[right]);
            right++;
            left++;
        }}
}    

};