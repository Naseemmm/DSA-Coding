class Solution {
   public int findKthPositive(int[] arr, int k) {
       
       // Edge case
       if (arr[0] > k) {
           return k;
       }
       
       int num = k;
       
       for (int i : arr) {
           if (i <= num) {
               num++;
           } else {
               break;
           }
       }
       
       return num;

    }
}