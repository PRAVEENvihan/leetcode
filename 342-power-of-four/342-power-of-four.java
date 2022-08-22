class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 0) {
            return false;
        }
        return Math.floor(Math.log(num)/Math.log(4)) == Math.ceil(Math.log(num)/Math.log(4));
    }
}