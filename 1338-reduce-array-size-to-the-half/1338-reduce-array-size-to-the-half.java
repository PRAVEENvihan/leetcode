class Solution {
    public int minSetSize(int[] arr) {
        int size=arr.length;
        HashMap<Integer , Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        
        ArrayList<Integer> counts = new ArrayList<>(map.values());
        Collections.sort(counts , Collections.reverseOrder());
        
        int rem = size/2;
        int pos=0;
        while(rem>0){
            rem = rem-counts.get(pos);
            pos++;
            
        }
        return pos;
        
    }
}