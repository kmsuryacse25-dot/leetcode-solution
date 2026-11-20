class Solution {
    public int countEven(int num) {

        int count =0;
        int temp =0;
        int sum =0;
        for(int i= 2;i<=num;i++){
             temp = i;
             sum=0;
             while(temp!=0){
                sum += temp%10;
                temp=temp/10;
             }

             if(sum%2==0){
                count++;
             }
        }
      return count;  
    }
}