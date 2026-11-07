class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        int low=0;
        int high=nums.length-1;
        int mid=0;
        boolean found=false;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                found=true;
                index=mid;
                break;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }

            
        }
        if(found ==true){
         return index;
        }
        else{
            return -1;
        }
    }
}