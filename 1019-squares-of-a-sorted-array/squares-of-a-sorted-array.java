class Solution {
    public int[] sortedSquares(int[] nums) {
// Squaring all the elemnets >>  Time complexity : O(n)

        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i]; 
        }


//  Arrays.sort(nums); >> Time complexity : O(nlogn)


        Arrays.sort(nums);    
        return nums;
    }
}
// overall Time Complexity : O(nlogn)


// Use two pointers to generate the sorted squares in O(n) time.

