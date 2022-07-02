class Solution {
    public int maximumPopulation(int[][] logs) {
       int[]a=new int[101];
        for(int i=0;i<logs.length;i++)
        {
            a[logs[i][0]-1950]++;
            a[logs[i][1]-1950]--;
        }
        for(int i=1;i<101;i++)
        {
            a[i]+=a[i-1];
        }
        int maxValue=0;
        int maxYear=1950;
        for(int i=0;i<101;i++)
        {
          if(maxValue<a[i])
          {
              maxValue=a[i];
              maxYear=i+1950;
          }
        }
        return maxYear;
       
    }
}