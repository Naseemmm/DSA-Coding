
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       ArrayList<Integer>a=new ArrayList<Integer>();
        int n=num.length;
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            num[i]=num[i]+k%10+c;
            a.add(num[i]%10);
            c=num[i]/10;
            k=k/10;
        }
        k=k+c;
        while(k!=0)
        {
           a.add(k%10);
            k/=10;
        }
        Collections.reverse(a);
        return a;
    }
}