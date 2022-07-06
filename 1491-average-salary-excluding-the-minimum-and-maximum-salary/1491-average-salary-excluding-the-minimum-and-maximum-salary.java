import java.util.*;

class Solution {
    public double average(int[] salary) {
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        double sum=0;
        int l = salary.length;
        for(int i=0;i<salary.length;i++){
            sum=sum+salary[i];
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
            
        }
        sum=sum-max-min;
        return (sum/(l-2));
        
    }
}