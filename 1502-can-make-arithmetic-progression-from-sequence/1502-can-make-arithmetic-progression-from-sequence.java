class Solution {
    public boolean canMakeArithmeticProgression(int[] A) {
        Arrays.sort(A);
        for(int i = 2;i<A.length;i++){
            if(A[i]-A[i-1]!=A[i-1]-A[i-2]) return false;
        }
        return true;
    }
}
  