class Solution {
    public int addDigits(int num) {

        int temp=0;
        int rev = num;

        while(rev>9){

            temp += num%10;
            if(num<=9){
            if(num/10 ==0){
                num=temp;
                if(temp<=9){
                    rev = temp;
                    
                }
                temp =0;
            }
            }
            else{
                num=num/10;
            }

        }

        return rev;
        
    }
}