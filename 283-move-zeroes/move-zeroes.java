class Solution {
    public void moveZeroes(int[] nums) {
        // int[] res = new int[nums.length];
        // int index = 0;
        // for(int num: nums){
        //     if(num == 0){
        //         continue;
        //     }
        //     res[index]=num;
        //     index++;
        // }
        // for(int i=0; i<nums.length; i++){
        //     nums[i]=res[i];
        // }

        // 

        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }        
    }
}