// class Solution {
//     public boolean isIdealPermutation(int[] nums) {
//         int max = -1;
//         for(int i=0;i<nums.length-2;i++){
//             max=Math.max(nums[i],max);
//             if(max>nums[i+2]) return false;
//         }
//         return true;
//     }
// }
class Solution {
    public int getLocal(int[] arr,int n)
    {
        int total=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
                total++;
        }
        return total;
    }
    public int merge(int[] arr,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+i+1];
        }
        int inv=0;
        int i=0,j=0,k=left;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k++]=a[i++];
            }
            else
            {
                arr[k++]=b[j++];
                inv+=n1-i;
            }
        }
        while(i<n1)
        {
            arr[k++]=a[i++];
        }
        while(j<n2)
        {
            arr[k++]=b[j++];
        }
        return inv;
    }
    public int sort(int[] arr,int left,int right)
    {
        int inv=0;
        if(left<right)
        {
            int mid=left+(right-left)/2;
            inv+=sort(arr,left,mid);
            inv+=sort(arr,mid+1,right);
            inv+=merge(arr,left,mid,right);
        }
        return inv;
    }
    public int getGlobal(int arr[],int n)
    {
        return sort(arr,0,n-1);
    }
    public boolean isIdealPermutation(int[] nums) {
        int n=nums.length;
        int local=getLocal(nums,n);
        int global=getGlobal(nums,n);
        return local==global;
    }
}