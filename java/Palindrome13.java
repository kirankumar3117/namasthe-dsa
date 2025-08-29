
public class Palindrome13 {

    public boolean checkPalindrome(int n) {
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
        Palindrome13 pali = new Palindrome13();
        System.out.println(pali.checkPalindrome(121));
    }
}
