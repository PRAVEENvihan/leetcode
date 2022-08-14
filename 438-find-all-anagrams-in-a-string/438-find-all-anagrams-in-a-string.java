class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length()) return ans;

        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < pArr.length ; i ++) {
            count1[pArr[i] - 'a']++;
            count2[sArr[i] - 'a']++;
        }

        for (int i = 0; i < sArr.length - pArr.length + 1; i++) {
            if(Arrays.equals(count1, count2)) ans.add(i);
            if(i == sArr.length - pArr.length) break;
            count2[s.charAt(i) - 'a'] --;
            count2[s.charAt(i + p.length()) - 'a'] ++;
        }

        return ans;
    }
}

