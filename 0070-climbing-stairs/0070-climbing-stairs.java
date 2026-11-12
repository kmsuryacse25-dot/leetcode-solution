class Solution {
    public int climbStairs(int n) {

        int a=2,b=3,temp=0;

        if(n<=3){
          b = n;
        }

        for(int i=4;i<=n;i++){
             temp = b;
             b= a+b;
             a= temp;   
        }
        
        return b;
    }
}