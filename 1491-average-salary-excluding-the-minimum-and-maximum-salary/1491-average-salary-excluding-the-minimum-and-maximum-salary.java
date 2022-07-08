class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double n=0;
       int i=0;
        while(i<salary.length-2)
        {
            n+=salary[i+1];
            i++;
        }
        
        return n/(salary.length-2);
    }
}