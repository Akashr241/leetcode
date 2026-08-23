class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {
            if (arr[i] == 0) {
                result[j] = 0;
                j++;
                if (j < n) {
                    result[j] = 0;
                    j++;
                }
            } else {
                result[j] = arr[i];
                j++;
            }
        }

        for (int k = 0; k < n; k++) {
            arr[k] = result[k];
        }
    }
}