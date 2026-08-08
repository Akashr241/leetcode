class Solution {
    public String reverseOnlyLetters(String s) {
        char[] demo = s.toCharArray();
        int l = 0;
        int r = demo.length - 1;
        
        while (l < r) {
            if (!Character.isLetter(demo[l])) {
                l++; // Skip non-letter from the left
            } else if (!Character.isLetter(demo[r])) {
                r--; // Skip non-letter from the right
            } else {
                // Both are letters, so swap them
                char temp = demo[l];
                demo[l] = demo[r];
                demo[r] = temp;
                l++;
                r--;
            }
        }
        return new String(demo);
    }
}