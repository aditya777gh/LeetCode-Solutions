class Solution {
    public boolean isPalindrome(int x) {
        int temp=x ,rev=0, d;
        for(int i=temp; i>0; i=i/10){
            d=i%10;
            rev=(rev*10)+d;
        }
        if(rev==x){
            return true ;
        }
        else{
            return false;
        }
    }
}