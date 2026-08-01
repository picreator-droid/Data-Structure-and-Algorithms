class Solution {
    public int findNumbers(int[] nums) {
        // 10-99 >> Even digits
        // 1000-9999 >> Even digits
        // 100000 (10^5) >> Even digits

        // int count = 0;

        // for(int i=0; i<nums.length; i++){
        //     if( nums[i]>9 && nums[i]<100 || nums[i]>999 && nums[i]<10000 || nums[i]==100000){
        //     count++;
        //     }
        // }
        // return count;
        int evenCount=0;
        for(int num : nums){
            int digit=0;
            while(num>0){
                num=num/10;
                digit++;
            }
            if(digit % 2 == 0) evenCount++; 
        }
        return evenCount;
   
    }
}