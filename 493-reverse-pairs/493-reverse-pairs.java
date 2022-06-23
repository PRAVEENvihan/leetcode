// class Solution {
// 	public int reversePairs(int[] nums) {
// 		return divide(nums);
// 	}
// 	public int divide(int [] array){
// 		if(array.length <2)
// 			return 0;

// 		int mid = array.length/2;
// 		int [] left = new int[mid];
// 		for(int i = 0;i<mid;i++){
// 			left[i] = array[i];
// 		}

// 		int [] right = new int [array.length - mid];

// 		for (int i =mid;i<array.length;i++)
// 			right[i - mid] = array[i];

// 		int count = divide(left);
// 		count += divide(right);
// 		count += merge(left,right,array);
// 		return count;
// 	}
// 	public int merge(int[] left, int[] right, int [] result){
// 		int i = 0, j = 0, k = 0, count = 0;
// 		while(i < left.length){
// 			while(j < right.length && left[i] > 2*(long)(right[j]))
// 				j++;
// 			count += j;
// 			i++;
// 		}
// 		i = 0;
// 		j = 0;
// 		while (i< left.length && j< right.length){
// 			if (left[i] <= right[j])
// 				result[k++] = left[i++];
// 			else{
// 				result[k++] = right[j++];
// 			}
// 		}
// 		while (i< left.length)
// 			result[k++] = left[i++];
// 		while (j< right.length)
// 			result[k++] = right[j++];
// 		return count;
// 	}
// 	}
class Solution {
    public class BIT {
        int[] arr;
        public BIT(int size) {
            arr = new int[size];
        }
        public void update(int idx, int delta) {
            idx++;
            while (idx < arr.length) {
                arr[idx] += delta;
                idx += (idx & -idx);
            }
        }
        public int getPrefixSum(int idx) {
            idx++;
            int sum = 0;
            while(idx>0) {
                sum += arr[idx];
                idx -= (idx & -idx);
            }
            return sum;
        }
    }
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        int n = nums.length;
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int[] nums2 = Arrays.stream(copy).distinct().toArray();
        BIT myBit = new BIT(nums.length+1);
        int totalCnt = 0;
        for(int i = nums.length-1;i>=0;i--) {
            int index1 = Arrays.binarySearch(nums2, (int) (nums[i]*1.0/2));
            if (index1>=0) {
                // need <= for the negative number
                if (nums[i] <= nums2[index1] *2) {
                    index1--;
                }
            }
            // can not find, Arrays.binarySearch returns -(insertion point) – 1). 
            if (index1<=-1) {
                index1 = Math.abs(index1)-2;
            }

            int index2 = Arrays.binarySearch(nums2, nums[i]);

            totalCnt+= myBit.getPrefixSum(index1);
            myBit.update(index2, 1);

        }
        return totalCnt;
    }
}