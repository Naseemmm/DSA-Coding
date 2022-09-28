class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:nums)
        {
            int current=0;
            int count=1;
            if(!set.contains(num-1))
            {
                current=num;
                while(set.contains(current+1))
                {
                    current+=1;
                    count++;
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
}