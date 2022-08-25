class Solution {
    public boolean canConstruct(String r, String m) {
        int[] countM=new int[26];
        for(int i=0;i<m.length();i++){
            countM[m.charAt(i)-'a']++;
        }
        for( int i=0;i<r.length();i++){
            if(--countM[r.charAt(i)-'a']<0) return false;
        }
        return true;
    }
}