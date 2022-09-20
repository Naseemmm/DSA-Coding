class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        for(int num:nums)
        {
            a.add(num);
        }
        int current=0;
        int count=0;
        int max=0;
        for(int num:nums)
        {
            if(!a.contains(num-1))
            {
                current=num;
                count=1;
                while(a.contains(current+1))
                {
                    current++;
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}