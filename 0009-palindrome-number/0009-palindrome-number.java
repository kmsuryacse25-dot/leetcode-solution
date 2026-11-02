class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int res =x;
        if(x<0){
            return false;
        }

        while(x!=0){
            int r = x%10;
            x=x/10;

            sum = (sum*10) +r; 
        }

        if(sum ==res){
            return true;
        }
        else
        {
            return false;
        }
        
    }
}