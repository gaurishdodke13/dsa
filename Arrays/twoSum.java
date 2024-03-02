import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        //Arrays.sort(nums);

        // for(int i=0; i<nums.length; i++){
        //     int num1 = nums[i];
        //     for(int j=i+1; j<nums.length; j++){
        //         int num2 = nums[j];
        //         if(num1 + num2 == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        
        HashMap< Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                ans[0] = map.get(comp);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }

        return ans;
        
    }
}