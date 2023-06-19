class Solution {
    public int maximizeSum(int[] a, int k) {
        int add=0,sum=0;
		int n=a.length-1;
		Arrays.sort(a);
		
		for(int i=0;i<k;i++)
		{
			
			sum=sum+a[n];
			add=1+a[n];
			a[n]=add;
			
		}
        return sum;
    }
}