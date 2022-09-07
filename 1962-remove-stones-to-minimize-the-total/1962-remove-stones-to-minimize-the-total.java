class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        
//         for(int i =0 ; i <k ; i++){
//             Arrays.sort(piles);
//             int temp=piles[piles.length-1];
//             if(temp%2!=0) piles[piles.length-1]=(int)Math.ceil(temp/2)+1;
//             else  piles[piles.length-1]=(int)Math.ceil(temp/2);
           
//             // System.out.println( piles[piles.length-1]);
                
//         }
//         int sum=0;
//         for(int i = 0 ; i<piles.length;i++){
//             sum+=piles[i];
//         }
//         return sum;
//     }
// }
        
int sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0 ; i<piles.length;i++){
            pq.add(piles[i]);
        }
        int t =0;
        
        while(t<k){
            int c = pq.poll();
            int r = Math.floorDiv(c,2);
            pq.offer(c-r);
            t++;
            
        }
        while(!pq.isEmpty()) sum+=pq.poll();
        return sum;
    }
}