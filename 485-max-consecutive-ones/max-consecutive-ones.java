class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countConsecutive = 0;
        int count=0;

        for(int i=0; i< nums.length; i++){
            
            if(nums[i]==1){
                count++;
            }
            else{
                if(count>countConsecutive){
                    countConsecutive=count;
                }
                count=0;
            }
            countConsecutive = Math.max(countConsecutive, count);
        }
        return countConsecutive;
    }
}