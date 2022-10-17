class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26) return false;
        HashSet<Character> map=new HashSet<>();
        for(char ch:s.toCharArray()){
            map.add(ch);
        }
        return map.size()==26;
    }
}