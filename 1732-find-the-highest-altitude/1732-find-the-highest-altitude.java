class Solution {
    public int largestAltitude(int[] gain) {
        int[] a=new int[gain.length];
        a[0]=gain[0];
        int max=a[0];
        for(int i=1;i<gain.length;i++)
        {
            a[i]=a[i-1]+gain[i];
            if(max<a[i])
            {
                max=a[i];
            }
        }
        if(max<0){
            max=0;
        }
        return max;
        
    }
}