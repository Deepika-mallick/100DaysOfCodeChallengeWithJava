public class PalindromeChecker {
    public static boolean isPalindrome(int x){
        int original = 0;
        int num = x;
        if(num < 0){
            return false;
        }
        while(x != 0){
            int rem = x % 10;
            original = original * 10 + rem;
            x /= 10;
        }
        if(original == num){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int i = -121;
        boolean result = isPalindrome(i);
        if(result) {
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }
    }
}
