class Solution {
    public int majorityElement(int[] nums) {
        
        // brute force:
        // int n = nums.length;
        
        // for(int i=0; i<n; i++){
        //     int count = 0;

        //     for(int j=0; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // moore's voting algorithm
        
        int n=nums.length;
        int ele=0;
        int count=0;

        for (int i=0; i<n; i++){
            if(count==0){
                count++;
                ele=nums[i];
            }
            else if(ele==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }return ele;       
    }
    
}