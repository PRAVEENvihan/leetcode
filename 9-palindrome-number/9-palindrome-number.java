class Solution {
    public boolean isPalindrome(int x) {
       int temp=x;
        int num= 0,rem=0;
        while(temp>0){
             rem=temp%10;
            temp=temp/10;
            num=num*10+rem;
        }
        return num==x;
    }
}