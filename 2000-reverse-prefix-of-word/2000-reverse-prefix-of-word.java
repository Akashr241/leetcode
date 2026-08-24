class Solution {
    public String reversePrefix(String word, char ch) {
        int r=word.indexOf(ch);
        int l=0;
        char c[]=word.toCharArray();
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        return new String(c);
    }
}