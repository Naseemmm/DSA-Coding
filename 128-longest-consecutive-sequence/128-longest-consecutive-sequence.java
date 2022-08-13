class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> a=new HashSet<>();
        for(int num:nums)
        {
            a.add(num);
        }
        int max=0;
        for(int num:nums)
        {
            if(!a.contains(num-1))
            {
                int current=num;
                int count=1;
            while(a.contains(current+1))
            {
               current+=1;
                count++;
            }
            max=Math.max(count,max);
        }
        }
        return max;
    }
}