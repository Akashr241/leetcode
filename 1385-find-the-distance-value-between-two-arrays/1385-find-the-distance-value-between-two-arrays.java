class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int p1 = 0;
        int p2 = 0;

        int res = 0;

        while(p1 < arr1.length){

            boolean isPossible = true;

            while(p2 < arr2.length){

                if(Math.abs(arr2[p2] - arr1[p1]) <= d){

                    isPossible = false;
                    break;
                }

                p2++;
            }

            p2 = 0;

            if(isPossible){
                res++;
            }

            p1++;
        }

        return res;
    }
}