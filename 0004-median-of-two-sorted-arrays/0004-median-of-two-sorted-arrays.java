class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
      int k=0;
      double result =0;
      int n = nums1.length + nums2.length;
      int[] arr=new int[n];

      int i=0,j=0;

      while(i<nums1.length && j<nums2.length){
        if(nums1[i]<nums2[j]){
            arr[k]=nums1[i];
            k++;
            i++;
        }
         else
        {
            arr[k]=nums2[j];
            k++;
            j++;
        }
      }

      while(i<nums1.length){
        arr[k]=nums1[i];
            k++;
            i++;
      }

      while(j<nums2.length){
        arr[k]=nums2[j];
            k++;
            j++;
      }

      if(n%2==0){
        int r = n/2;
        result = (double)(arr[r]+arr[r-1])/2;
      }
      else
      {
        int z = n/2;
        result = arr[z];
      }
      
   
       return result;
    }
}