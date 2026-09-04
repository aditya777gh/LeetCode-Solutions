class Solution {
    public int subtractProductAndSum(int n) {
        //Aditya
        int dig, prod=1, sum=0;
        while(n!=0){
            dig=n%10;
            prod=prod*dig;
            sum=sum+dig;
            n=n/10;
        }
        return prod-sum;
    }
}