class Solution {
    public int removeDuplicates(int[] nums) {

        int k=0;
        for(int i=0;i<nums.length;i++){

         if(nums.length-1==i){
            nums[k]=nums[i];
            k++;
        }
        else if(nums[i]==nums[i+1]){
            continue;
        }   
        else if(nums.length-1==i){
            nums[k]=nums[i];
        }
        else{
            nums[k]=nums[i];
            k++;
        } 
    }
    return k;
}
}