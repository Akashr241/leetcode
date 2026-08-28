class Solution {
    public boolean isPrefixString(String s, String[] words) {

        int i = 0;
        char[] sample = s.toCharArray();

        for (int j = 0; j < words.length; j++) {

            String word = words[j];

            for (int k = 0; k < word.length(); k++) {

                if (i >= sample.length || word.charAt(k) != sample[i]) {
                    return false;
                }

                i++;
            }

            if (i == sample.length) {
                return true;
            }
        }

        return false;
    }
}