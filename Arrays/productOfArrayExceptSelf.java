class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
    

        // for(int i=0; i<nums.length; i++){
        //     int j = nums.length-1-i;
        //     if(i==0){
        //         pre[i] = 1;
        //     }else{
        //         pre[i] = pre[i-1] * nums[i-1];
        //     }

        //     if(j==nums.length-1){
        //         suff[j] = 1;
        //     }else{
        //         suff[j] = suff[j+1] * nums[j+1];
        //     }
        // }

        // for(int i=nums.length-1; i>=0; i--){
        //     if(i==nums.length-1){
        //         suff[i] = 1;
        //     }else{
        //         suff[i] = suff[i+1] * nums[i+1];
        //     }
        // }

        for(int i=0; i<nums.length; i++){
            int j = nums.length-1-i;
            if(i==0){
                pre[i] = 1;
            }else{
                pre[i] = pre[i-1] * nums[i-1];
            }

            if(j==nums.length-1){
                suff[j] = 1;
            }else{
                suff[j] = suff[j+1] * nums[j+1];
            }
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = pre[i] * suff[i];
        }

        return nums;
        
    }
}