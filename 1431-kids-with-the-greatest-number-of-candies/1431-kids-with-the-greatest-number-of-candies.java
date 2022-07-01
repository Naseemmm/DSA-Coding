class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=-99999;
       ArrayList<Boolean> a=new ArrayList<Boolean>();
        for(int i=0;i<n;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
              a.add(i,true);
            }
            else
            {
                a.add(i,false);
            }
        }
        return a;
    }
}