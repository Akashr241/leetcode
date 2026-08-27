class Solution { 
    public boolean isLongPressedName(String name, String typed) { 
        
        if (name.length() > typed.length()) 
            return false;

        int j = 0;

        char[] sample = name.toCharArray();

        for (int i = 0; i < typed.length(); i++) {

            char temp = typed.charAt(i);

            if (j < sample.length && sample[j] == temp) {
                j++;
            }
            else if (i == 0 || typed.charAt(i) != typed.charAt(i - 1)) {
                return false;
            }
        }

        return j == sample.length;
    }
}