class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r=arr.length;
        int c=arr[0].length;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==target) return true ;
               
                
            }
        }
        return false;
    }
}