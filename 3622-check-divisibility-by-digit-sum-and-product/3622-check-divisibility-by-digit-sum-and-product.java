class Solution {
    public boolean checkDivisibility(int n) {

        int result =0;
        int temp =n;
        int sum =0,prod =1;

        while(temp !=0)
        {
            sum += temp%10;
            prod *= temp%10;
            temp = temp/10;
        }

        result = sum+prod;

        if(n%result==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}