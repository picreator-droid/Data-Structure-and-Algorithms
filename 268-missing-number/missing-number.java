class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int expSum=n*(n+1)/2;  //sum of all natural numbers
        
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            // expSum+= i;
            
        }   
        // expSum+=nums.length;
        int missing=expSum-sum;
        return missing;
    }
}