class Solution {
    public int mirrorDistance(int n) {
       int temp =n;

       int rev=0;
       int a=0;

       while(temp !=0){
        a=temp%10;

        rev = (rev*10)+a;
        temp = temp/10;
       }

       return Math.abs(n-rev);
    }
}