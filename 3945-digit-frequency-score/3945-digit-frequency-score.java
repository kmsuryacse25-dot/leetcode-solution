class Solution {
    public int digitFrequencyScore(int n) {

        int temp=0;
        while(n!=0){
             temp +=n%10;

             n = n/10;
        }

        return temp;
        
    }
}