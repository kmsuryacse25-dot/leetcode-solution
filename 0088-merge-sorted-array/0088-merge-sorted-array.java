import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

      
      int i=0,j=0,k=0;
      int[] arr = new int[m+n];

      while(i<m && j<n){
        if(nums1[i]<=nums2[j]){
            arr[k] = nums1[i];
            k++;
            i++;
        }
       else
        {
            arr[k] = nums2[j];
            k++;
            j++;
        }
      }

      while(i<m){
        arr[k] = nums1[i];
        k++;
        i++;
      }
      while(j<n){
        arr[k] = nums2[j];
        k++;
        j++;
      }  
      
      for(i=0;i<(m+n);i++){
        nums1[i]=arr[i];
       
      }
      System.out.println(Arrays.toString(nums1));
    }
}