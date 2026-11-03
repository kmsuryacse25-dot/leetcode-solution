class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,k=0;
        int n=nums.length;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            sum+=nums[i];
            arr[k]=sum;
            k++;
        }

        return arr;
        
    }
}