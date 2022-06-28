class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        
		// There are 256 valid ascii character so we can create two arrays of size 256 of one with 512..
        int[] mark = new int[512];
        
        for (int i = lenS - 1; i >= 0; i--) {
            int charT = t.charAt(i);
            int charS = s.charAt(i) + 256;
            
            if (mark[charT] != mark[charS]) return false;
            mark[charT] = mark[charS] = i;
        }
        
        return true;
    }
}