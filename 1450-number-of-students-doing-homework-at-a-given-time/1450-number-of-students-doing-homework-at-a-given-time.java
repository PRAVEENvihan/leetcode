class Solution {
    public int busyStudent(int[] st, int[] et, int qt) {
        int l = st.length;
        int count=0;
        for(int i = 0 ; i  < l ; i++){
            if(st[i]<=qt && et[i]>=qt) count++;
        }
        return count;
    }
}