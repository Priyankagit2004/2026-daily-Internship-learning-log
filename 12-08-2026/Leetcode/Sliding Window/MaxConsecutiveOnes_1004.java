class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount =0;
        int max_ones = 0;
        int start =0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]==0)
                zerocount++;

            while(zerocount>k){
                if(nums[start]==0)
                    zerocount--;
                start++;
            }
            max_ones = Math.max(max_ones,i-start+1);
        }
        return max_ones;
    }
}