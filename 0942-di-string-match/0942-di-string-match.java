class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int arr[]=new int[n+1];
        int h=n,l=0;
        for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='I')
                {
                    arr[i]=l;
                    l++;
                }
                else
                {
                    arr[i]=h;
                    h--;
                }
            }
        arr[n]=h;
        return arr;
    }
}