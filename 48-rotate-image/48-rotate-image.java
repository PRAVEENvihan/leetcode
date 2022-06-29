class Solution {
    public void rotate(int[][] arr) {
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr[0].length;j++){
                int t=0;
                t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int t=0;
                t=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=t;
                
                
            }
        }
    }
}