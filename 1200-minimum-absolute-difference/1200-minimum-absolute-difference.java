class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
    List <List<Integer>>b=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min((arr[i]-arr[i-1]),min);
        }
        
        for(int i=1;i<arr.length;i++)
        {
             List<Integer> a=new ArrayList<>();
            if(min==(arr[i]-arr[i-1])){
                a.add(arr[i-1]);
               a.add(arr[i]);
            b.add(a);
            }
        }
     return b;
    }
}