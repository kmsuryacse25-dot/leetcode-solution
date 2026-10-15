import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = nums.length/2;
        int index =0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                index=entry.getKey();
            }
        }

       
        return index;
    }
}