// class Solution {
//     public boolean searchMatrix(int[][] arr, int target) {
//         int r=arr.length;
//         int c=arr[0].length;
//         for(int i =0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(arr[i][j]==target) return true ;
               
                
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int i = 0, j = matrix[0].length - 1;
      while(i < matrix.length && j >= 0) {
        if(matrix[i][j] == target)
          return true;
        else if(matrix[i][j] > target)
          j --;
        else if(matrix[i][j] < target)
          i ++;
      }
      return false;
    }
}