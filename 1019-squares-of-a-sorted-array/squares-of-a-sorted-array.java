class Solution {
    public int[] sortedSquares(int[] nums) {
// Squaring all the elemnets >>  Time complexity : O(n)

        // for(int i=0; i<nums.length; i++){
        //     nums[i] *= nums[i]; 
        // }


//  Arrays.sort(nums); >> Time complexity : O(nlogn)


    //     Arrays.sort(nums);    
    //     return nums;

    // overall Time Complexity : O(nlogn)
    

        // Use two pointers to generate the sorted squares in O(n) time.

        int n=nums.length;
        int[] res=new int[n];
        for(int i=0; i<n; i++){
            nums[i] *= nums[i];
        }
        int head=0;
        int tail=n-1;
        for(int i=n-1; i>=0; i--){
            if(nums[head]>nums[tail]){
                res[i]=nums[head];
                head++;
            }
            else{
                res[i]=nums[tail];
                tail--;
            }
        }
        return res;
    }
}




