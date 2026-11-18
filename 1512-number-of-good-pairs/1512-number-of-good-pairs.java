import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
            sum +=((map.get(key)*(map.get(key)-1))/2);
        }
        
        return sum;
    }
}