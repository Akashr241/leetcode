class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int j = s.indexOf(c);
        int k = s.substring(j + 1).indexOf(c) + j + 1;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                j = i;
                k = s.substring(j + 1).indexOf(c) + j + 1;
            }
            ans[i] = Math.min(Math.abs(i - j), Math.abs(i - k));
        }

        return ans;
    }
}