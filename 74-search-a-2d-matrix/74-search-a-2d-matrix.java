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
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//       int i = 0, j = matrix[0].length - 1;
//       while(i < matrix.length && j >= 0) {
//         if(matrix[i][j] == target)
//           return true;
//         else if(matrix[i][j] > target)
//           j --;
//         else if(matrix[i][j] < target)
//           i ++;
//       }
//       return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r=arr.length;
        int c=arr[0].length;
        int left=0;
        int right= r*c-1;
        while(left<=right){
            int midpoint=left+(right-left)/2;
                    int midpoint_element=arr[midpoint/c][midpoint%c];

            if(midpoint_element==target) return true;
           
            else if(target<midpoint_element) right=midpoint-1;
             else if(target>midpoint_element) left=midpoint+1;
        }
        return false;
    }
}