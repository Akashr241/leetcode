class Solution {
    public int removePalindromeSub(String s) {
        if(isPalindromic(s)) return 1;
        return 2;
    }

    static boolean isPalindromic(String s){
        int n = s.length();
        int l = 0, r = n - 1;

        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}