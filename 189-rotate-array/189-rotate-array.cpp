class Solution {
public:
    void reverse(vector<int>&num,long long low,long long high){
        while(low<high){
            swap(num[low],num[high]);
                low++;
            high--;
        }
        }
    void rotate(vector<int>& nums, int k) {
        long long n=(int)nums.size();
        k=k%n;
        if(k<0){
k+=n;}
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
};