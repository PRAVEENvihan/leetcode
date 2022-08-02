// class Solution {
//     public int kthSmallest(int[][] mat, int k) {
//         int r=mat.length;
//         int n=0;
//         int c=mat[0].length;
//         if(r==0 || c==0) return 0;
//         if(r==1) return mat[0][k-1];
//         if(c==1) return mat[k-1][0];
//         if(r<2 && k==1) return mat[0][0];
//         else if(r<2 && k==2) return mat[0][1];
//         else if(r<2 && k==3) return mat[1][0];
//         else if(r<2 && k==4) return mat[1][1];
//         else if(r>2){
//         n=k%r;
//         n=n-1;
//         int m =k/r;
//         return mat[m][n];}
        
//     }
// }
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length;
        
        int lo = matrix[0][0], hi = matrix[rows - 1][cols - 1] ;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0,  maxNum = lo;
           
            for (int r = 0, c = cols - 1; r < rows; r++) {
                while (c >= 0 && matrix[r][c] > mid) c--;   
                
                if (c >= 0) {
                    count += (c + 1); 
                    maxNum = Math.max(maxNum, matrix[r][c]); 

                }else{ //it means c < 0
                    break;
                } 
            }
            
            if (count == k) return maxNum;
            else if (count < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

}