class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum=0;
        for(int num : nums){
            rightSum += num;
        }
        int leftSum = 0;

        for(int i=0; i<nums.length; i++){
            int value = nums[i];

            rightSum -= value;
            if(rightSum == leftSum){
                return i;
            }
            leftSum += value;
        }
        return -1;
    }
}