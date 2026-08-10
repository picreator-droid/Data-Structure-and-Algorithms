class Solution {
    public void rotate(int[] nums, int k) {
        // int n= nums.length;
        // int[] res= new int[n];
        // int index=0; 
        // for(int i=n-k; i<n; i++){
        //     res[index]=nums[i];
        //     index++;
        // }
        // for(int i=0; i<n-k; i++){
        //     res[index]=nums[i];
        //     index++;
        // }
        // for(int i=0; i<n; i++){
        //     nums[i]=res[i];
        // }
        // Time complexity: O(n) 
        // Space complexity: O(n)

        int n=nums.length;
        k=k%n;

        rev(nums, 0, n-1);
        rev(nums, 0, k-1);
        rev(nums, k, n-1);

    }
    public void rev(int[] nums, int s, int e){
        while(s<e){
            int temp= nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}