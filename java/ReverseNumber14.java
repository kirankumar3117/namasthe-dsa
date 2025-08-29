
public class ReverseNumber14 {

    public int reverseNumber(int num) {
        int ori = num;
        int rev = 0;
        num = Math.abs(num);
        while (num > 0) {
            int rem = num % 10;
            rev = (10 * rev) + rem;
            num /= 10;
        }
        return (ori < 0) ? -rev : rev;
    }

    public static void main(String[] args) {
        ReverseNumber14 res = new ReverseNumber14();
        System.out.println(res.reverseNumber(-15258523));
    }
}
