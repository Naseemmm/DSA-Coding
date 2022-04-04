class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n=nums.size()-1;
        long long  left=0;
        long long  right=n;
        vector<int>output(n+1);
        for(int i=n;i>=0;i--){
if(abs(nums[left])>nums[right]){
   output[i]=nums[left]*nums[left];
   left++;
    }
   else{
       output[i]=nums[right]*nums[right];
           right--;
   }
   }       
    return output;    
    }
};