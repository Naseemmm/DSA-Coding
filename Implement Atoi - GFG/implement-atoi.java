//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	    int sign=(str.charAt(0)=='-')?-1:1;
	    if(str.charAt(0)=='+' || str.charAt(0)=='-') str=str.substring(1);
	    int ans=0;
	    for(int i=0;i<str.length();i++){
	        char c=str.charAt(i);
	        if(!Character.isDigit(c)) return -1;
	        ans=10*ans+(c-'0');
	    }
	    return ans*sign;
    }
}