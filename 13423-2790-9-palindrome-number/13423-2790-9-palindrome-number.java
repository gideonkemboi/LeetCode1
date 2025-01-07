class Solution {
    public boolean isPalindrome(int x) {
        String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();
            
        if (String.valueOf(x).equals(reversed)) {
            return true;
        }
        
        return false;
    }
}