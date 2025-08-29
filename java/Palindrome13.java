
public class Palindrome13 {

    public static Boolean checkPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int ori = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (10 * rev) + rem;
            n /= 10;
        }
        return rev == ori;
    }

    public static void main(String[] args) {
        Boolean result = checkPalindrome(151);
        System.out.println("result: " + result);
    }
}
