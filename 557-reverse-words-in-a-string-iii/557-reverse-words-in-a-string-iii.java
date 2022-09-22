class Solution {
    public String reverseWords(String str) {
    String ans="";
    Stack<Character> st=new Stack<Character>();
    for (int i = 0; i < str.length(); ++i) {
        if (str.charAt(i) != ' ')
            st.push(str.charAt(i));
  
        else {
            while (st.empty() == false) {
                ans+=(st.pop());
                 
            }
            ans+=(" ");
        }
    }
  
    while (st.empty() == false) {
        ans+=(st.pop());
         
    }
        return ans;
}
 

}