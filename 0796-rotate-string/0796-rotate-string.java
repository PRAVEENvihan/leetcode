class Solution {
    public boolean rotateString(String s, String t) {
        if(s.length()!=t.length()) return false;
        String p=s+s;
        
        if(p.contains(t)) return true;
        else return false;
    }
}