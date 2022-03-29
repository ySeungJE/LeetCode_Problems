package Leet_Code;

class palindrome_number {
    public boolean isPalindrome(int x) {
            if(x<0) return false;
            long y = Long.parseLong((new StringBuilder().append(x).reverse().toString()));
            return (x==y) ? true : false; 
        }
}
