class Solution {
    public int smallestIndex(int[] nums) {

        int index = -1;
        int max = nums[0];
        int sum = 0;
        int temp = 0;

        for(int i = 0;i<nums.length;i++){
            sum =0;
            temp = nums[i];
            while(temp!=0){
                sum += temp%10;
                temp = temp/10;
            }

           if(i == sum){
    index = i;
    break;
}
        }

      return index;
        
    }
}