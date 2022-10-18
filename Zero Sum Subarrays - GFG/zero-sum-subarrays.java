//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
       HashMap<Long,Long>map=new HashMap<>();
       int count =0;
       long sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
           if(sum==0)
             count++;
           if(map.containsKey(sum))
           {
               count+=map.get(sum);
               map.put(sum,map.get(sum)+1);
           }
           else
           map.put(sum,1L);
       }
       return count;
    }
}