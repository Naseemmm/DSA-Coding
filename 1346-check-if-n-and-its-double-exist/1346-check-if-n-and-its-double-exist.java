class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Double,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey((double)arr[i]*2)||map.containsKey((double)arr[i]/2))
            {
                return true;
        }
            map.put((double)arr[i],1);
        }
        return false;
    }
}