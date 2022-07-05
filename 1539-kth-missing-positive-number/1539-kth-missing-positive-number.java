class Solution {
   public int findKthPositive(int[] arr, int k) {
       
       // Edge case
       if (arr[0] > k) {
           return k;
       }
       
       
       for (int i = 1; i <= arr.length; i++) {
           if ( arr[i-1] - i >= k) {
               
               return i + k - 1; 
           }
       }
       
       
       return k + arr.length;

   }
    }