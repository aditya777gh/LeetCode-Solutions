class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equalsIgnoreCase(s)){
            return true;
        }
        else{
            return false;
        }
    }
}