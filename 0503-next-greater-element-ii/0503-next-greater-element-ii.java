class Solution {
    public int[] nextGreaterElements(int[] nums) {
         
      Stack<Integer>s=new Stack<>();
        int n=nums.length;
      int[] a=new int[n];
        for(int i=2*n-1;i>=0;i--)
      {
          while(!s.isEmpty() && s.peek()<=nums[i%n])
          {
              s.pop();
          }
          if(s.isEmpty()==false)
          {
              a[i%n]=s.peek();
          }
          else
          {
              a[i%n]=-1;
          }
          s.push(nums[i%n]);
      }
      return a;
    }
}