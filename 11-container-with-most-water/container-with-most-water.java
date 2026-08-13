class Solution {
    public int maxArea(int[] height) {
        // int left=0;
        // int right=height.length-1;
        // int amount=0;
        // int max_amt=0;
        // while(left<right){
            
        //     if(height[left]>= height[right]){
        //         amount=height[right]*(right-left);
        //         max_amt=Math.max(amount, max_amt);
        //         right--;
        //     }
        //     else if(height[left]<height[right]){
        //         amount=height[left]*(right-left);
        //         max_amt=Math.max(amount, max_amt);
        //         left++;
        //     }
        // }
            
        // return max_amt;

        int left=0;
        int right=height.length-1;
        int max_amount=0;
        while(left<right){
            // area = shorter length * (right-left)
            int amt = Math.min(height[left],height[right]) * (right-left);
            max_amount=Math.max(amt, max_amount);
            if(height[left]>=height[right]){
                right--;
            }
            else{
                left++;
            }

        }
        return max_amount;

    }
}