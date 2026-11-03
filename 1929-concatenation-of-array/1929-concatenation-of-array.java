class Solution {
    public int[] getConcatenation(int[] nums) {
      int k=0;

      int n=2*nums.length;
      int[] arr = new int[n];

      for(int i=0;i<nums.length;i++){
        arr[k]=nums[i];
        arr[nums.length+i]=nums[i];
        k++;
      }

      return arr;  
    }
}