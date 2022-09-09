class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr , (a,b)->a[0]==b[0]? b[1] -a[1]:a[0]-b[0]);
        int res= 0;
        
        int min=0;
        for(int i=arr.length-1;i>=0;i--){
            int[] newArr=arr[i];
            int attack=newArr[0];
            int defense=newArr[1];
            
            if(defense<min){
                System.out.println(defense);
                res++;
            }
            min=Math.max(min,defense);
        }
        return res;
    }
}