class Solution {
    public int searchInsert(int[] nums, int target) {
        int found=0,index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found = 1;
                index = i;
            }

        }
        if(found==1){
            return index;
        }
         if(target<nums[0]){
            return 0;

         }
         if(target> nums[nums.length-1]){
            return nums.length;
         }

         for(int i=0;i<nums.length;i++){
          if(target>nums[i]&&nums[i+1]>target){
                return i+1;
             }
         }
        return 0;
    }
}