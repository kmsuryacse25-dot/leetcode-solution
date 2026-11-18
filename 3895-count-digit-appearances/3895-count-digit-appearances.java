class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

     int temp =0;
     int count =0;

     for(int i=0;i<nums.length;i++){
        temp = nums[i];
        while(temp!=0){
            if(digit == temp%10){
                count++;
            }
            temp = temp/10;
        }
     }

     return count;
        
        
    }
}