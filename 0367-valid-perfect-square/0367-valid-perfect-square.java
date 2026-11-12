class Solution {
    public boolean isPerfectSquare(int num) {

        boolean result = false;

        if(num ==0 || num ==1){
            result = true;
            
        }
        for(int i=2;i<num;i++)
        {
            if((long)(i*i)==num){
                result = true;

            }

            if((long)(i*i)>num){
                break;
            }
        }
        return result;
    }
}